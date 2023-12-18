import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int value = Integer.parseInt(tokens[1]) * 10 + Integer.parseInt(tokens[2]);
		if (value % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}