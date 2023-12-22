import java.awt.Point;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int i, j, n;
		boolean flag;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			Point[] x_y = new Point[n];
			Point tmp = new Point();
			for(i = 0; i < n; i++) {
				x_y[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			do {
				flag = false;
				for(i = 0; i < n - 1; i++) {
					if(x_y[i].x > x_y[i + 1].x) {
						tmp = x_y[i];
						x_y[i] = x_y[i + 1];
						x_y[i + 1] = tmp;
						flag = true;
					}else if(x_y[i].y > x_y[i + 1].y && x_y[i].x == x_y[i + 1].x){
						tmp = x_y[i];
						x_y[i] = x_y[i + 1];
						x_y[i + 1] = tmp;
						flag = true;
					}
				}
			}while(flag);
			for(Point output : x_y) {
				System.out.println(output.x + " " + output.y);
			}
		}
	}
}
