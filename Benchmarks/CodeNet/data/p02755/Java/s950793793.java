import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		Double aa = a / 0.08;
		Double bb = b / 0.10;

		int i = aa.intValue();
		int j = bb.intValue();

		if (i == j) {
			System.out.println(i);
		} else {
			int in = 0;
			int st = i > j ? j : i;
			boolean bool = true;
			for (int ii = b; ii <= 100; ii++) {
				Double c = (st + in) * 0.08;
				Double d = (st + in) * 0.10;
				int cc = c.intValue();
				int dd = d.intValue();
				if (cc == dd) {
					System.out.println(st + in);
					bool = false;
					break;
				}
				in++;
			}
			if (bool) {
				System.out.println("-1");
			}
		}

		sc.close();
	}

}