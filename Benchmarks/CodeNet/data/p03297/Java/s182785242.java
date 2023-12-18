import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		long[] a;
		String[] ans;
		ans = new String[n];

		a = new long[4];

		for(i=0;i<n;i++) {
			ans[i] = "No";
			for(int j=0;j<4;j++) a[j] = sc.nextLong();
			long sum = a[0];
			while((sum-a[1])>=0) {
				sum = sum - a[1];
				if(sum <= a[2])sum = sum + a[3];
				if(sum == a[0]) {
					ans[i] = "Yes";
					break;
				}
			}
		}
		for(i=0;i<n;i++)System.out.println(ans[i]);
	}
}
