


import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);

		if (n%2==0) {
			int from = 0;
			int to = n-1;
			long ans1 = 0;
			long lastNum = a[n/2];
			while(true) {
				ans1 += (lastNum-a[from]);
				lastNum= a[from];
				from++;
				if (to-from==0) break;
				ans1 += (a[to]-lastNum);
				lastNum= a[to];
				to--;
				if (to-from==0) break;
			}
			from = 0;
			to = n-1;
			long ans2 = 0;
			lastNum = a[n/2-1];
			while(true) {
				ans2 += (a[to]-lastNum);
				lastNum= a[to];
				to--;
				if (to-from==0) break;
				ans2 += (lastNum-a[from]);
				lastNum= a[from];
				from++;
				if (to-from==0) break;
			}
			System.out.println(Math.max(ans1, ans2));
		}
		else {
			int from = 0;
			int to = n-1;
			long ans1 = 0;
			long lastNum = a[n/2];
			while(true) {
				ans1 +=  (lastNum-a[from]);
				lastNum= a[from];
				from++;
				if (to-from==0) break;
				ans1 += (a[to]-lastNum);
				lastNum= a[to];
				to--;
				if (to-from==0) break;
			}
			from = 0;
			to = n-1;
			long ans2 = 0;
			lastNum = a[n/2];

			
			while(true) {
				ans2 +=  (a[to]-lastNum);
				lastNum= a[to];

				to--;
				
				if (to-from==0) break;
				ans2 +=  (lastNum-a[from]);
				lastNum= a[from];

				from++;
				if (to-from==0) break;
			}
			System.out.println(Math.max(ans1, ans2));
		}

	}


}
