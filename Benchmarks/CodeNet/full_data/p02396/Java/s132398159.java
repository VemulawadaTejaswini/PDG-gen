import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10000];
		for (int i = 0; i <= 9999; i++) {
			String line = sc.nextLine();
			num[i] = Integer.parseInt(line);
			if (num[i] == 0 || num[i] >= 10000) {
				break;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0 || num[i] >= 10000) {
				break;
			}
			System.out.println("case " + (i + 1) + ": " + num[i]);
		}
	}
}