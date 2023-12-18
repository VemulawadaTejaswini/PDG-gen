import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int employee = sc.nextInt();
		int[] boss = new int[employee - 1];
		for (int i = 0; i < boss.length; i++) {
			boss[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < employee; i++) {
			int result = 0;
			for (int b : boss) {
				if ((b - 1) == i) {
					result++;
				}
			}
			System.out.println(result);
		}
	}

}
