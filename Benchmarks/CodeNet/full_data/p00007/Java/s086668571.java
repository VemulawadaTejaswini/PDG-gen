import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int debt = 100000;
		for (int i = 0; i < n; ++i) {
			debt += debt / 20;
			int up = 1000 - debt % 1000;
			if (up != 1000) debt += up;
		}
		System.out.println(debt);
		sc.close();
	}
}
