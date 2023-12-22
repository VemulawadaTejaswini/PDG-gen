import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			i++;
			int v = in.nextInt();
			if (v == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + v);
		}
	}

}