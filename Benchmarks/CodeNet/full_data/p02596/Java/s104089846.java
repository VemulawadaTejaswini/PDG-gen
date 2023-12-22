import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());

		long N = 7 % num;
		int ans = -1;

		for (int i = 0; i < num ; i++) {
			if (N == 0) {
				ans = i + 1;
				break;
			}
			N = (N * 10 + 7) % num;
		}

		System.out.println(ans);

	}
}