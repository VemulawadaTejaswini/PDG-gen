import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();
		
		Koch(num);
		
		scanner.close();
	}
	
	public static void Koch(int num){
		
		if(num == 0){
			System.out.printf("%.8f %.8f\n", 0.0, 0.0);
		}else{
			KochCurve(0, num, 0, 0, 100, 0);
		}
		 System.out.printf("%.8f %.8f\n", 100.0, 0.0);
		
	}
	
	//コッホ
	public static void KochCurve(final int deep, final int n, double x1, double y1, double x2, double y2){
		double x_diff = x2 - x1;
		double y_diff = y2 - y1;
		
		double x3_1 = x1 + x_diff / 3;
		double y3_1 = y1 + y_diff / 3;
		double x3_2 = x1 + 2 * x_diff / 3;
		double y3_2 = y1 + 2 * y_diff / 3;
		double x3_f = Math.cos(Math.toRadians(Math.toDegrees(Math.atan2(y_diff, x_diff)) + 60)) * (Math.sqrt(x_diff * x_diff + y_diff * y_diff) / 3) + x3_1;
		double y3_f = Math.sin(Math.toRadians(Math.toDegrees(Math.atan2(y_diff, x_diff)) + 60)) * (Math.sqrt(x_diff * x_diff + y_diff * y_diff) / 3) + y3_1;
		
		if(deep == n - 1){
			System.out.printf("%.8f %.8f\n",   x1,   y1);
			System.out.printf("%.8f %.8f\n", x3_1, y3_1);
			System.out.printf("%.8f %.8f\n", x3_f, y3_f);
			System.out.printf("%.8f %.8f\n", x3_2, y3_2);
		}else{
			KochCurve(deep + 1, n, x1, y1, x3_1, y3_1);
			KochCurve(deep + 1, n, x3_1, y3_1, x3_f, y3_f);
			KochCurve(deep + 1, n, x3_f, y3_f, x3_2, y3_2);
			KochCurve(deep + 1, n, x3_2, y3_2, x2, y2);
		}
    }
}
