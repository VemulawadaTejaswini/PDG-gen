import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n-- > 0) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double x4 = scan.nextDouble();
			double y4 = scan.nextDouble();
			
			double x12 = x2 - x1;
			double y12 = y2 - y1;
			double x34 = x4 - x3;
			double y34 = y4 - y3;
			
			if ((x12 == x34 && y12 == y34) || (x12 == -x34 && y12 == -y34)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	
	private void debug() {
		System.out.println();
	}

}