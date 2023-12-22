import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			double d = sc.nextInt();

			int count = 0;

			for (int i = 0; i < n; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();

				if (d >= calDist(x, y)) {
					count++;
				}
			}

			System.out.println(count);


		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static double calDist (double  x, double y) {
		double ans = 0;

		ans = Math.pow(x, 2) + Math.pow(y, 2);
		ans = Math.sqrt(ans);

		return ans;
	}
}
