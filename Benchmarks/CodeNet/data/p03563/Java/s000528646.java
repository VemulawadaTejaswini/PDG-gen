import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int G = scan.nextInt();

		int P = 2*G - R;
		System.out.println(P);

	}

}
