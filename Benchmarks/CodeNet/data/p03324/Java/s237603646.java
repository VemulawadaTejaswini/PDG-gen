import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		int d = Integer.parseInt(sc1.next());
		int n = Integer.parseInt(sc1.next());
		System.out.println(div(d, n));
		sc1.close();
	}

	public static int div(int d, int n) {
		int num = n;
		if (d == 1) {
			num = n * 100;
		}
		if (d == 2) {
			num = n * 10000;
		}
		return num;
	}
}