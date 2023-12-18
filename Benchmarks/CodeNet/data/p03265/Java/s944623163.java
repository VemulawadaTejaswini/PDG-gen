import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int x1 = sc.nextInt();
		final int y1 = sc.nextInt();
		final int x2 = sc.nextInt();
		final int y2 = sc.nextInt();
		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 0;
		if(x1 == x2) {
			if(y1 > y2) {
				x3 = x2 + (y1 - y2);
				y3 = y2;
				x4 = x2 + (y1 - y2);
				y4 = y1;
			} else {
				x3 = x2 - (y2 - y1);
				y3 = y2;
				x4 = x2 - (y2 - y1);
				y4 = y1;
			}
		} else if(y1 == y2) {
			if(x1 > x2) {
				x3 = x2;
				y3 = x2 - (x1 - x2);
				x4 = x1;
				y4 = x2 - (x1 - x2);
			} else {
				x3 = x2;
				y3 = x2 + (x2 - x1);
				x4 = x1;
				y4 = x2 + (x2 - x1);
			}
		} else if(x1 < x2) {
			if(y1 < y2) {
				 x3 = x2 - (y2 - y1);
				 y3 = y2 + (x2 - x1);
				 x4 = x1 - (y2 - y1);
				 y4 = y1 + (x2 - x1);
			} else {
				 x3 = x2 + (y1 - y2);
				 y3 = y2 + (x2 - x1);
				 x4 = x1 + (y1 - y2);
				 y4 = y1 + (x2 - x1);
			}
		} else if(x1 > x2) {
			if(y1 < y2) {
				 x3 = x2 - (y2 - y1);
				 y3 = y2 - (x1 - x2);
				 x4 = x1 - (y2 - y1);
				 y4 = y1 - (x1 - x2);
			} else {
				 x3 = x2 + (y1 - y2);
				 y3 = y2 - (x1 - x2);
				 x4 = x1 + (y1 - y2);
				 y4 = y1 - (x1 - x2);
			}
		}
		
		System.out.print(x3 + " ");
		System.out.print(y3 + " ");
		System.out.print(x4 + " ");
		System.out.print(y4);
	}
}