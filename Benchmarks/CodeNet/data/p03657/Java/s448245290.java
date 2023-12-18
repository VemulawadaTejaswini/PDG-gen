import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a + b) < 3  ) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possible");
		}

	}
}