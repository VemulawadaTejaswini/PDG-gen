import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1, x2, x3, x4, y1, y2, y3, y4;
		int factor = 10000;
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
		
			long v1_x, v1_y, v2_x, v2_y;
			v1_x = (int)((x2 - x1) * factor);
			v1_y = (int)((y2 - y1) * factor);
			v2_x = (int)((x4 - x3) * factor);
			v2_y = (int)((y4 - y3) * factor);
			long op = v1_x * v2_y - v1_y * v2_x;
		
			if (op == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}