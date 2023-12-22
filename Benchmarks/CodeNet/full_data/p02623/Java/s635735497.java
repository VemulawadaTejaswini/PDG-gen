import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		long k = scan.nextLong();
		long ans = 0;
		long read = 0;
		long[] a = new long[n];
		long[] b = new long[m];
		int indexA = 0;
		int indexB = 0;
		int loop = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		for(int i = 0; i < m; i++) {
			b[i] = scan.nextLong();
		}
		
		while(loop == 0) {
			if(indexA == n && indexB == m) { 
				break; 
			} else if(indexA == n) {
				read = read + b[indexB];
				indexB++;
			} else if(indexB == m) {
				read = read + a[indexA];
				indexA++;
			} else if(a[indexA] < b[indexB]) {
				read = read + a[indexA];
				indexA++;
			} else {
				read = read + b[indexB];
				indexB++;
			}
			
			if(read >= k) {
				if(read == k) {
					ans++;
				}
				break;
			} else {
				ans++;
			}
		}
		System.out.print(ans);
	}
}