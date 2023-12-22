import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 27 * 7 + 22;
		while (in.hasNext()) {
			System.out.println(in.nextDouble() * i / 27);
		}
	}
}