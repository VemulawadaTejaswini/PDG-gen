import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n+1];
		a[0] = 0;
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextLong()+a[i-1];
		}
		long[] b = new long[m+1];
		b[0] = 0;
		for(int i = 1; i <= m; i++) {
			b[i] = sc.nextLong()+b[i-1];
		}
		int ans = 0;
		for(int i = 0; i <= n; i++) {
			long temp = k - a[i];
			if(temp < 0) {
				break;
			}
			int low = -1;
			int high = m+1;
			int mid ;
			while(low+1 < high) {
				mid = (low+high)/2;
				if(b[mid] > temp) {
					high = mid;
				}
				else {
					low = mid;
				}
			}
			ans = Math.max(ans, low+i);
		}
		System.out.println(ans);
	}
}
