import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int m = scanner.nextInt(), f = scanner.nextInt(), r = scanner.nextInt();
			if (m == -1 && f == -1 && r == -1) break;
			System.out.println(m == -1 || f == -1 ? "F"
					: m + f >= 80 ? "A"
							: m + f >= 65 ? "B"
									: m + f >= 50 ? "C"
											: m + f >= 30 ? (r >= 50 ? "C"
													: "D")
													: "F");
		}
	}
}

