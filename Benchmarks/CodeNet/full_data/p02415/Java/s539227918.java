import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = null;

		try {
			//??\?????????
			sc = new Scanner(System.in);
			String line = sc.nextLine();

			//?°????????????????
			String anser = line.toLowerCase();

			System.out.println(anser);

		} finally {
			sc.close();
		}

	}

}