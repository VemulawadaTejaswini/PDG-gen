import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			
			double x = x1-x2;
			double y = y1-y2;

			double ans = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) );

			System.out.println(ans);
		}
	}

}

