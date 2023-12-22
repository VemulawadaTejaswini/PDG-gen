import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		int[]  a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[m];
		for(int i = 0; i < m ; i++) {
			b[i] = sc.nextInt();
		}
		int nc = 0;
		int mc = 0;
		long judge = 0;
		long count = 0;
		if(a[0] > k && b[0] > k) {
			System.out.println(0);
			return;
		}
		while(nc+mc <= n+m-1) {
			if(mc < m && nc < n) {
				if(a[nc] <= b[mc]) {
					judge += a[nc];
					nc++;
					if(judge > k) {
						break;
					}
//					count++;
				}
				else {
					judge += b[mc];
					mc++;
					if(judge > k) {
						break;
					}
//					count++;
				}
			}
			else {
				if(mc < m) {
					judge += b[mc];
					mc++;
					if(judge > k) {
						break;
					}
//					count++;
				}
				else {
					judge += a[nc];
					nc++;
					if(judge > k) {
						break;
					}
					
				}
				
			}
			count++;
		}
		System.out.println(count);
	}
}
