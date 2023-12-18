import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				long sam = a[i] + a[j];
				if(isPowerOfTwo(sam)) {
					ans ++;
				}
			}
		}
		System.out.println(Math.max(ans, n/2));
		sc.close();
	}
	public static boolean isPowerOfTwo(long x){
	    return x > 0 && (x & (x - 1)) == 0;
	}
}
