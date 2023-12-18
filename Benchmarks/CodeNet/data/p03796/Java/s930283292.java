import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int trainingTime = sc.nextInt();
		long power = 1;
		long amari = 0;
		for (int i = 0; i < trainingTime; i++) {
			power *= i + 1;
			power %= 1000000007;
		}
		amari = power % 1000000007;
		System.out.println(amari);
	}

}
