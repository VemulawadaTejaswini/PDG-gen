import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			String[] s = String.valueOf(i).split("");
			int sum = 0;
			for (int j = 0; j < s.length; j++) {
				sum += Integer.parseInt(s[j]);
			}
			if (sum >= A && sum <= B) {
				ans += i;
			}
		}
		System.out.println(ans);
	}
}

