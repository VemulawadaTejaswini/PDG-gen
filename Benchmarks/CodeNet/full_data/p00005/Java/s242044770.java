import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, goc;
		while (in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			System.out.print(goc = goc(a, b));
			System.out.print(" ");
			System.out.println(a / goc * b);
		}
	}

	static int goc(int a, int b) {
		if (b != 0) return goc(b, a % b);
		else return a;
	}
}