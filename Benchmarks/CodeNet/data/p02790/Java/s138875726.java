import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ", 0);
		char A = line[0].charAt(0);
		char B = line[1].charAt(0);
		StringBuilder sb = new StringBuilder();
		if (A <= B) {
			for (int i = 0; i < Integer.parseInt(line[1]); i++) {
				sb.append(A);
			}
			System.out.println(sb.toString());
		} else {
			for (int i = 0; i < Integer.parseInt(line[0]); i++) {
				sb.append(B);
			}
			System.out.println(sb.toString());
		}

	}
}