import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		String line = sc.nextLine();
		sc.close();
		int con = 0;
		for (int i = 0; i < len - 2; i++) {
			String cut = line.substring(i, i + 3);
			if (cut.equals("ABC")) {
				con++;
			}
		}

		System.out.println(con);

	}
}
