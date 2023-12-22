import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double ans = Math.pow(x1-x2,2) + Math.pow(y1-y2,2);
		ans = Math.sqrt(ans);
		System.out.println(ans);
	}
}
