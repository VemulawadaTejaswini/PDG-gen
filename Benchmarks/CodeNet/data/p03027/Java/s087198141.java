import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			long ans = 1;
			for (int j = 0; j < n; j++) {
				int multi = (x + (d * j)) %1000003;
				ans = (ans * multi) %1000003;
			}
			System.out.println(ans %  1000003);
		}
	}
}