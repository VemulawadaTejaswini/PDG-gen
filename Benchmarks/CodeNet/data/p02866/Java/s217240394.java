import java.util.Scanner;
 
public class Main {
	static final long MOD = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		long[] cntD = new long[n];
		
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
			cntD[d[i]]++;
		}
		
		boolean exist = d[0] == 0;
//		for (int i = 2; i < n; i++) {
//			if (cntD[i - 1] == 0 && cntD[i] != 0) {
//				exist = false;
//				break;
//			}
//		}
		
		if (!exist) {
			System.out.println(0);
			sc.close();
			return;
		}
		
		long cnt = 1;
		for (int i = 2; i < n - 1; i++) {
			cnt = (cnt * pow(cntD[i - 1], cntD[i])) % MOD;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
	
	static long pow(long a, long b) {
		long re = 1;
		for (int i = 0; i < b; i++) {
			re = (re * a) % MOD;
		}
		return re;
	}
	
	
}

