import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int power = sc.nextInt();
		int number = sc.nextInt();
		int score = 1;
		for (int i = 0; i < power; i++) {
			score = score * 100;
		}
		score = score * number;
		System.out.println(score);

	}

}