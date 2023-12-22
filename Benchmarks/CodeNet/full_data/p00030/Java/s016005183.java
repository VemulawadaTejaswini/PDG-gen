
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int mem[][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		mem = new int[11][46];
		dfs(0, 0, 0);
		for(;;) {
			int n = sc.nextInt(), s = sc.nextInt();
			if( (n|s) == 0 ) break;
			if( s > 45 ) System.out.println(0);
			else System.out.println(mem[n][s]);
		}
	}
	
	void dfs(int i, int s, int c) {
		mem[c][s]++;
		if( i == 10 || c == 11 ) return;
		for(int j=i;j<10;j++) dfs(j+1, s+j, c+1);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}