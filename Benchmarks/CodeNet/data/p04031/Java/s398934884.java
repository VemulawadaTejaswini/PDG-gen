import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int ans = 1001001001;
		for(int i = -100 ; i <= 100 ; i++) {
			int temp = 0;
			for(int j = 0 ; j < n ; j++) {
				temp += (a[j] - i) * (a[j] - i);
			}
			ans = Math.min(ans, temp);
		}
		System.out.println(ans);
	}
}
