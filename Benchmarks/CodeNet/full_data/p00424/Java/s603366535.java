import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Main.run();
	}

	@SuppressWarnings("resource")
	private static void run() {
		Scanner scan = new Scanner(System.in);
		int n;
		while ((n = scan.nextInt()) != 0) {
			char[] cvt = new char[Byte.MAX_VALUE];
			for (int i = 0; i < Byte.MAX_VALUE; i++)
				cvt[i] = (char) i;
			for (int i = 0; i < n; i++) {
				int idx =  scan.next().charAt(0);
				cvt[idx] = scan.next().charAt(0);
			}

			int m = scan.nextInt();
			for (int i = 0; i < m; i++) {
				System.out.print(cvt[scan.next().charAt(0)]);
			}
			System.out.println("");
		}
		System.exit(0);

	}
}