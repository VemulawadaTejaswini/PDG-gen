import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int pointT = 0, pointH = 0;

			for (int i = 0; i < n; i++) {
				String T = scan.next();
				String H = scan.next();
				if (T.compareTo(H) < 0)
					pointH += 3;
				else if (T.compareTo(H) == 0) {
					pointT++;
					pointH++;
				} else
					pointT += 3;
			}
			System.out.println(pointT + " " + pointH);
			break;
		}
		scan.close();
		System.exit(0);
	}

}