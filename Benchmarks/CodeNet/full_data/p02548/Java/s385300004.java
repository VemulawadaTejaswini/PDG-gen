import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			int n = sc.nextInt();

			long result = 0;
			for (int i = 1; i < n; i++) {
				result += (n - 1) / i;

			}
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}