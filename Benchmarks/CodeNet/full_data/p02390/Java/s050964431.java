import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int time_sec = sc.nextInt();

			int hour = time_sec / 3600;
			int minute = time_sec % 3600 / 60;
			int second = time_sec % 60;

			System.out.println(hour + ":" + minute + ":" + second);
		} catch(InputMismatchException ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
	}
}

