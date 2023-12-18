import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		if (n % 2 == 0) {
			System.out.println(n);
		} else {
			System.out.println(n * 2);
		}
		in.close();
	}

}