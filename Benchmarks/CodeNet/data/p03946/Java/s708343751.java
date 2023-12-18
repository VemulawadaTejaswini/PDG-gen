import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		int[] count = new int[n];
		int ans=0;
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int profit = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (profit < a[i + j] - a[i])
					profit = a[i + j] - a[i];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (profit == a[i + j] - a[i]) {
					ans++;
					count[i + j]++;
					count[i]++;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(count[i]>1)ans--;
		}
		System.out.println(ans);
	}

}
