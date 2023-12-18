import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] >= sum / 4 / m) {
				cnt++;
			}
		}
		
		String ans = cnt >= m ? "Yes" : "No";
		System.out.println(ans);
	}
}
