import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		for (int i = 0; i < 100; i++) {
			if (N % 4 == 0 || N % 7 == 0 || N % 11 == 0) {
				System.out.println("Yes");
				return;
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}
