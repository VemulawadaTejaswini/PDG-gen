import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while (n-- > 0) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();

			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();

			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();

			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();

			// (y2-y1)/(x2-x1) == (y4-y3)/(x4-x3)
			// (y2-y1)*(x4-x3) == (y4-y3)*(x2-x1)
			if ( (y2-y1)*(x4-x3) != (y4-y3)*(x2-x1) ) {
				System.out.println("NO");
//			} else if ( (x2-x1)*(y3-y1) == (y2-y1)*(x3-x1) ){
//				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}

}