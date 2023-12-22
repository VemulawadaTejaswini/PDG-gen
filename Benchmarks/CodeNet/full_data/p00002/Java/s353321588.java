import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int a;
		int b;
		int i=0;
		int sum[] = new int[3];

		Scanner sc = new Scanner(System.in);
		String lineSeparator = System.getProperty("line.separator");
			while (sc != null) {
				a = sc.nextInt();
				b = sc.nextInt();

				int ans = a + b;

				String stAns = Integer.toString(ans);
				int count = stAns.substring(0).length();
				System.out.println(count);

			}

	}

}