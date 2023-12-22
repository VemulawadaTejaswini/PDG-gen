import java.util.Scanner;

public class Main {

	// ヘロンの公式(３つの辺から求めるver)
	public static double getArea (double a, double b, double c) {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	// ２点間の距離
	public static double getDistance (double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double tol = 0.000000001;

		while (sc.hasNextLine()) {
			double[] nums = new double[8];
			String[] str = sc.nextLine().split(",");
			for (int i = 0; i < nums.length; i++)
				nums[i] = Double.parseDouble(str[i]);
			double ab = getDistance(nums[0],nums[1],nums[2],nums[3]);
			double bc = getDistance(nums[2],nums[3],nums[4],nums[5]);
			double cd = getDistance(nums[4],nums[5],nums[6],nums[7]);
			double da = getDistance(nums[6],nums[7],nums[0],nums[1]);
			double bd = getDistance(nums[2],nums[3],nums[6],nums[7]);
			double ac = getDistance(nums[0],nums[1],nums[4],nums[5]);
			double area1 = Math.abs(getArea(ab,bc,ac) - getArea(da,cd,ac));
			double area2 = Math.abs(getArea(bc,cd,bd) - getArea(ab,bd,da));
			boolean b = area1 < tol && area2 < tol;
//			System.out.println(area1 + "," + area2);
			System.out.println(b ? "YES" : "NO");
		}

	}

}