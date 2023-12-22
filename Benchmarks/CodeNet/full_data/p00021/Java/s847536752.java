import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			if (y2 - y1 != 0) {
				double ABk = (x2 - x1) / (y2 - y1);
				if (y4 - y3 == 0)System.out.println("NO");
				else {
					double CDk = (x4 - x3) / (y4 - y3);
					if (ABk == CDk)System.out.println("YES");
					else System.out.println("NO");
				}
			} else {
				if (y4 - y3 != 0) System.out.println("NO");
				else System.out.println("YES");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}