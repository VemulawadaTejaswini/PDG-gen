
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int val[] = {1, 5, 10, 50, 100, 500};
	int ret[];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		ret = new int[500];
		fill(ret, INF);
		ret[0] = 0;
		for(int i=0;i<500;i++) for(int j=0;j<val.length;j++) {
			if( i + val[j] < 500) ret[i+val[j]] = min(ret[i+val[j]], ret[i] + 1);
		}
		
//		debug(ret);
		for(;;) {
			int P = sc.nextInt();
			if(P==0) break;
			int coins[] = new int[6];
			for(int i=0;i<coins.length;i++) {
				coins[i] = sc.nextInt();
			}
			int V = P+500;
			int[][] pay = new int[2][V];
			for(int[] a: pay) fill(a, INF);
			pay[0][0] = 0;
			for(int j=0;j<coins.length;j++){ 
				pay[1-j%2] = pay[j%2].clone();
				for(int i=0;i<V;i++) {
					for(int k=1;k<=coins[j];k++) if( i+k*val[j] < V ) {
						pay[1-j%2][i+k*val[j]] = min(pay[1-j%2][i+k*val[j]], pay[j%2][i] + k);
					}
				}
//				debug(pay[1-j%2]);
			}
			
//			debug(pay[1]);
			int ans = INF;
			for(int i=0;i<500;i++) {
				int tmp = pay[0][P+i] + ret[i];
				ans = min(ans, tmp);
			}
			
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}