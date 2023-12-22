import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int min = 1000000;
		int max = 0;
		int num;
		int x;
		int maxBene = 0;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			x = sc.nextInt();
			if (x < min) {
				min = x;
				max = x;
			} else if (max < x) {
				max = x;
				if (maxBene < max - min) {
					maxBene = max - min;
				}
			}
		}
		System.out.println(maxBene);
	}
}