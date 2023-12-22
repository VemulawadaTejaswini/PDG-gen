import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int tc;
	public static void main(String[] args) {
		tc = 0;
		while (read()) {
			solve();
			tc++;
		}
	}
	
	static int M;
	static int[] nc = new int[4], cv = {10, 50, 100, 500, 10000};
	static boolean read() {
		M = sc.nextInt();
		if (M == 0) return false;
		if (tc > 0) System.out.println();
		for (int i = 0; i < 4; i++) nc[i] = sc.nextInt();
		return true;
	}

	static void solve() {
		int min = 1 << 25;
		int[] ans = new int[4];
		int tmp = 0;
		for (int i = 0; i <= nc[0]; i++) {
			for (int j = 0; j <= nc[1]; j++) {
				for (int k = 0; k <= nc[2]; k++) {
					for (int l = 0; l <= nc[3]; l++) {
						tmp = i * cv[0] + j * cv[1] + k * cv[2] + l * cv[3];
						if (tmp >= M) {
							tmp -= M;
							int tmp2 = nc[0] + nc[1] + nc[2] + nc[3] - (i + j + k + l);
							int[] tmp3 = new int[4];
							for (int m = 3; m >= 0; m--) {
								tmp3[m] = tmp / cv[m];
								tmp2 += tmp3[m];
								tmp -= tmp3[m] * cv[m];
							}
							
							if (min > tmp2) {
								ans[0] = i;
								ans[1] = j;
								ans[2] = k;
								ans[3] = l;
//								System.out.println(ans[0] + " " + ans[1] + " " + ans[2] +" " + ans[3]);
								min = tmp2;
							}
						}
					}
				}
			}
			
		}
		
		for (int i = 0; i < 4; i++) 
			if (ans[i] > 0) 
				System.out.println(cv[i] + " " + ans[i]);
	}	
}