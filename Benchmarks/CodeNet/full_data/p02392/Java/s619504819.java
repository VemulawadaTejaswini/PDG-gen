import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		threeJudge(a, b, c);

	}

	static void threeJudge(int a, int b, int c) {
		if (a >= 0 && c <= 100) {
			if (a < b && b < c) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}else{
			System.out.println("NO2");
		}
	}

}