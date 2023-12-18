import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] x = new int[100010];
		for(int i = 0 ; i < n ; i++) {
			x[a[i]]++;
		}
		int ans = 0;
		for(int i = 0 ; i < 100010 ; i++) {
			int cnt = 0;
			if(i == 0) {
				cnt = x[i] + x[i + 1];
			} else if(i == 100009) {
				cnt = x[i] + x[i - 1];
			} else {
				cnt = x[i - 1] + x[i] + x[i + 1];
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
}