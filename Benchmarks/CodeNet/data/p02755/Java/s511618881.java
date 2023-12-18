import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		
		float x = (float) (a/0.08);
		float y = (float) x * 0.1f;
		
		if ((int) b == (int) y) {
			System.out.println((int) x);
			return;
		}
		
		y = b / 0.1f;
		x = y * 0.08f;
		
		if ((int) a == (int) x) {
			System.out.println((int) y);
			return;
		}
		
		System.out.println(-1);
		
//		if (a*0.08 > b*0.1) {
//			float temp = a;
//			a = b;
//			b = temp;
//		}
//		
//		
//		float x = (float) (a / 0.08);
//		
//		int k = (int) a;
//		int m = (int) (x * 0.1);
//		
//		
//		if (k == a && m == b) {
//			System.out.println((int) x);
//		} else {
//			System.out.println(-1);
//		}
		
		

	}

}