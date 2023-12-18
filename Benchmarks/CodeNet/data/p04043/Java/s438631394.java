import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int seven = 0;
		int five = 0;
		int[] num = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {

			num[i] = scanner.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			if (num[i] == 5) {
				five=five+1;
			}
			if (num[i] == 7) {
				seven=seven+1;
			}

		}

		if (five == 2 && seven == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}