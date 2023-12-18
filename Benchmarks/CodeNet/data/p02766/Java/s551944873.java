import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = Integer.toString(n, k);
			System.out.println(s.length());
		}

	}

}
