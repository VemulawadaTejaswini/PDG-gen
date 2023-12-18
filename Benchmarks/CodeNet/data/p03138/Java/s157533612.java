import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long K = scn.nextLong();
		boolean[] k  = bbb(K);
		long[] A = new long[N];
		boolean[] X = new boolean[64];
		
		int[] num = new int[64];
		
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
			for(int j = 0;j < 64;j++) {
				if(((A[i] >> j) & 1)==1) {
					num[j]++;
				}
			}
		}
		
		boolean no = true;
		
		for(int i = 63;i > -1;i--) {
			if(no) {
				if(!k[i])continue;
				if(num[i] >= (N+1)/2) {
					X[i] = false;
					no = false;
				}else {
					X[i] = true;
				}
			}else {
				if(num[i] >= (N+1)/2) {
					X[i] = false;
				}else {
					X[i] = true;
				}
			}
		}
		long x = toX(X);
		
		
		long ans = 0;
		for(int i = 0;i < N;i++) {
			ans += A[i] ^ x;
		}
		System.out.println(ans);
	}
	
	
	public static boolean[] bbb(long k) {
		boolean[] b = new boolean[64];
		int i = 0;
		while(k > 0) {
			b[i] = (k&1) == 1;
			i++;
			k = k >>> 1;
		}
		return b;
	}
	public static long toX(boolean[] X) {
		long x = 0;
		for(int i = 0;i < 64;i++) {
			if(X[i]) {
				x += 1 << i;
			}
		}
		return x;
	}

}
