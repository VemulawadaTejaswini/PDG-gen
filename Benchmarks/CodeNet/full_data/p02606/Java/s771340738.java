import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			String[] arr = data.split(" ");
			int L = Integer.parseInt(arr[0]);
			int R = Integer.parseInt(arr[1]);
			int d = Integer.parseInt(arr[2]);

			int ans = 0;
			for (int i = L; i <= R; i++) {
				if (i % d == 0) {
					ans++;
				}
			}

			System.out.println(ans);
		}
	}
}
