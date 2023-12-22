
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] map = new int[n][n];
		for(int i=0;i<m;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			int x = Integer.parseInt(sc.next());
			for(int j=0;j<=x;j++) map[a+j][b] = max(map[a+j][b], x-j+1);
		}
		int cnt = 0;
		for(int i=0;i<n-1;i++) for(int j=0;j<n-i-1;j++) {
			map[i+j+1][j+1] = max(map[i+j][j]-1, map[i+j+1][j+1]);
		}
		for(int i=0;i<n;i++) for(int j=0;j<n;j++)
			if(map[i][j]>0) cnt++;
//		for(int[] a: map)debug(a);
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}