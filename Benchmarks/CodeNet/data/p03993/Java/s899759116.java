import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;

		for(int i = 0 ; i < n ; i++) {
			int pos = a[i] - 1;
			if(a[pos] == pos) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
