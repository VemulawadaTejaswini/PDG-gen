import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		sc.close();

		int util = 0;
		util += (X / 500) * 1000;
		int rest = X % 500;
		util += (rest / 5) * 5;
		System.out.println(util);

	}

}
