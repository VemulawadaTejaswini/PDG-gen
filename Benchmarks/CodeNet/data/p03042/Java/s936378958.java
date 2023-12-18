import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] array = new int[2];
		for (int i = 0; i < 4; i++) {
			int num = s % 10 * (int) Math.pow(10, i);
			array[1 - i / 2] += num;
			s /= 10;
		}
		array[0] /= 100;
		if (array[0] <= 0 || array[0] > 12) {
			if (array[1] <= 0 || array[1] > 12) {
				System.out.println("NA");
			} else {
				System.out.println("YYMM");
			}
		} else {
			if (array[1] <= 0 || array[1] > 12) {
				System.out.println("MMYY");
			} else {
				System.out.println("AMBIGUOUS");
			}
		}
	}
}
