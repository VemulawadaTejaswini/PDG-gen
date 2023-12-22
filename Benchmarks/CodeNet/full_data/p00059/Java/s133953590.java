import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double xa1 = sc.nextDouble();
			double ya1 = sc.nextDouble();
			double xa2 = sc.nextDouble();
			double ya2 = sc.nextDouble();
			double xa3 = xa2;
			double ya3 = ya1;
			double xa4 = xa1;
			double ya4 = xa2;
			double xb1 = sc.nextDouble();
			double yb1 = sc.nextDouble();
			double xb2 = sc.nextDouble();
			double yb2 = sc.nextDouble();
			double xb3 = xb2;
			double yb3 = yb1;
			double xb4 = xb1;
			double yb4 = yb2;
			double[] xa = {xa1, xa2, xa3, xa4};
			double[] ya = {ya1, ya2, ya3, ya4};
			double[] xb = {xb1, xb2, xb3, xb4};
			double[] yb = {yb1, yb2, yb3, yb4};
			boolean flag = true;
			for(int i = 0; i < 4; i++) {
				if(xa1 <= xb[i] && xb[i] <= xa2 && ya1 <= yb[i] && yb[i] <= ya2) {
					flag = false;
					System.out.println("YES");
					break;
				}
				if(xb1 <= xa[i] && xa[i] <= xb2 && yb1 <= ya[i] && ya[i] <= yb2) {
					flag = false;
					System.out.println("YES");
					break;
				}
			}
			if(flag) {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
