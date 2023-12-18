import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());

		if (A > X) {
			System.out.println("NO");
		} else if (A + B < X) {
			System.out.print("NO");
		} else {
			System.out.println("YES");
		}

	}

}