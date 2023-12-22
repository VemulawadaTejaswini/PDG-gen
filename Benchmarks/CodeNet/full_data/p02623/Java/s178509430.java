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
		if(a[1] > k && b[1] > k) {
			System.out.println(0);
			return;
		}
		int count = 0;
		for(int i = 0; i <= n; i++) {
			long temp = k - a[i];
			if(k < a[i]) {
				break;
			}
			int check = i;
			int low = 0;
			int high = m;
			while(low != high) {
				int mid = (low+high)/2;
//				System.out.println(b[mid] < temp);
				if(b[mid] > temp) {
					high = mid-1;
//					System.out.println(high);
					if(b[high] <= temp) {
						check += high;
						break;
					}
				}
				else  if(b[mid] <temp){
					low = mid+1;
					if(b[low] > temp) {
						check += (low-1);
						break;
					}
				}
				else {
					check += mid;
					break;
				}
			}
			if(low == high) {
				check += low;
			}
			count = Math.max(check,count);
		}
		System.out.println(count);
	}
}
