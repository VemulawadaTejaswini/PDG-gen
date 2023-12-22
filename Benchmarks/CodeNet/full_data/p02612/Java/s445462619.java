import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		while (n > 0) {
			n -= 1000;
		}
		n *= -1;
		System.out.println(n);
	}

}
