import java.util.Scanner;

/**
 * 2019/06/16
 * AtCoder Beginner Contest 130
 * 
 * C - Rectangle Cutting
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();

		// xを固定
		long m1;
		{
			long a = H * x;
			long b = H * (W - x);
			if(a < b) {
				m1 = a;
			} else {
				m1 = b;
			}
		}
		// yを固定
		long m2;
		{
			long a = W * y;
			long b = W * (H - y);
			if(a < b) {
				m2 = a;
			} else {
				m2 = b;
			}
		}
		
		double result1;
		int result2;
		if(((m1 == 0) && ( m2 == 0))) {
			result1 = (H * W) / 2;
			result2 = 0;
		} else {
			if(m1 > m2) {
				result1 = m1;
				result2 = 0;
			} else if(m1 < m2) {
				result1 = m2;
				result2 = 0;
			} else {
				result1 = m1;
				result2 = 1;
			}
		}
		
		System.out.println(result1 + " " + result2);
	}
	
}