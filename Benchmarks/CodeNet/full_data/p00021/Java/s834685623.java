import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1, x2, x3, x4, y1, y2, y3, y4;
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			x1 = scanner.nextDouble();
			y1 = scanner.nextDouble();
			x2 = scanner.nextDouble();
			y2 = scanner.nextDouble();
			x3 = scanner.nextDouble();
			y3 = scanner.nextDouble();
			x4 = scanner.nextDouble();
			y4 = scanner.nextDouble();
		
			double v1_x, v1_y, v2_x, v2_y;
			v1_x = x2 - x1;
			v1_y = y2 - y1;
			v2_x = x4 - x3;
			v2_y = y4 - y3;
		
			double ip = (v1_x * v2_x + v1_y * v2_y) * (v1_x * v2_x + v1_y * v2_y);
			double norm = (v1_x * v1_x + v1_y * v1_y) * (v2_x * v2_x + v2_y * v2_y);
			
			if (ip == norm) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}