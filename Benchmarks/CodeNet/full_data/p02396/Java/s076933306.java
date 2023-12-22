import java.util.Scanner;

public class Main { // クラス名はMain
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;
		while (i < 10001) {
			int x = sc.nextInt();
			if (x == 0) {
				System.exit(0);
			} else {
				i++;
				System.out.println("Case " + i + ": " + x);
			}

		}
	}

}
