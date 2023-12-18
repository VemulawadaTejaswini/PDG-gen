import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int s = sc.nextInt();
		int i = 1;
		while (true) {
			if (s == 8) {
				break;
			}
			if (s % 2 == 0) {
				s = s / 2;
			} else {
				s = s * 3 + 1;
			}
			i++;
		}
		System.out.println(i + 4);
	}
}
