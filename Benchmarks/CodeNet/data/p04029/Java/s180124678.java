import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());
			int ans = n * (n + 1) / 2;

			System.out.println(ans);

		} finally {
			sc.close();
		}
	}
}