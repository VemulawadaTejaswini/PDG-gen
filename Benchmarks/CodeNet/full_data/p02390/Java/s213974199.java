import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		int s = 0;

		try(Scanner scan = new Scanner(System.in)) {
			int second = scan.nextInt();
			h = second / 3600;
			m = (second % 3600) / 60;
			s = (second % 3600) % 60;

			System.out.println(h + ":" + m + ":" + s);
		}
	}

}