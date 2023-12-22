import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		for (int i = 0; i < 5; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (input[i] == 0) {
				System.out.println(i + 1);
			}
		}

	}
}