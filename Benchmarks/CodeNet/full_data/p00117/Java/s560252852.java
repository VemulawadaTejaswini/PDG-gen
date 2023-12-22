
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n,m;
	int[][] map;
	int cost;
	int expense;
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m= sc.nextInt();
		map = new int[n][n];
		for(int i=0;i<n;i++) {
			fill(map[i], INF);
		}
		for(int i=0;i<m;i++) {
			String[] str = sc.next().split(",");
			int a = Integer.parseInt(str[0])-1;
			int b = Integer.parseInt(str[1])-1;
			int c = Integer.parseInt(str[2]);
			int d = Integer.parseInt(str[3]);
			map[a][b] = c;
			map[b][a] = d;
		}
		wf();
		String[] str = sc.next().split(",");
		int f = Integer.parseInt(str[0])-1;
		int t = Integer.parseInt(str[1])-1;
		cost = Integer.parseInt(str[2]);
		expense = Integer.parseInt(str[3]);
		
		System.out.println(cost - expense - map[f][t] - map[t][f]);
	}
	
	void wf() {
		for(int i=0;i<n;i++) for(int j=0;j<n;j++) for(int k=0;k<n;k++){
			map[i][k] = min(map[i][k], map[i][j] + map[j][k]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}