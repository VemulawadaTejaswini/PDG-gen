import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		a[0] = 0;
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt()+a[i-1];
		}
		int[] b = new int[m+1];
		b[0] = 0;
		for(int i = 1; i <= m; i++) {
			b[i] = sc.nextInt()+b[i-1];
		}
		if(a[1] > k && b[1] > k) {
			System.out.println(0);
			return;
		}
		int count = 0;
		for(int i = 0; i <= n; i++) {
			int temp = k - a[i];
			if(k < a[i]) {
				break;
			}
			int check = i;
			int low = 0;
			int high = m;
			while(low != high) {
				int mid = (low+high+1)/2;
//				System.out.println(b[mid] < temp);
				if(b[mid] > temp) {
					high = mid-1;
					if(high < 0) {
						high = 0;
					}
//					System.out.println(high);
					if(b[high] <= temp) {
						check += high;
						break;
					}
				}
				else  if(b[mid] <temp){
					low = mid+1;
					if(low > m) {
						low = m;
					}
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
