import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int tAttack = ((c - 1) / b) + 1;
		int aAttack = ((a - 1) / d) + 1;

		boolean answer = tAttack <= aAttack;

		printBool(answer);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
