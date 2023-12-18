
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int abs = 0;
		int num = 1;
		for(int i = 1; i < n + 1; i++) {
			int in = sc.nextInt();
			a[i] = in;
			if(Math.abs(abs) < Math.abs(in)) {
				abs = in;
				num = i;
			}
		}
		int cnt = 0;
		String ans = "";
		for(int i = 1; i < n + 1; i++) {
			if(i != num) {
				ans += num + " " + i + "\n";
				cnt++;
			}
		}
		if(abs < 0) {
			for(int i = n; i > 1; i--) {
				ans += i + " " + (i - 1) + "\n";
				cnt++;
			}
		} else {
			for(int i = 1; i < n; i++) {
				ans += i + " " + (i + 1) + "\n";
				cnt++;
			}
		}
		ans = cnt + "\n" + ans;
		System.out.println(ans);

	}

}
