import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextLong();
		double v = sc.nextLong();
		double b = sc.nextLong();
		double w = sc.nextLong();
		double t = sc.nextLong();
		a += v * t;
		b += w * t;
		if(a >= b) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
	}
}