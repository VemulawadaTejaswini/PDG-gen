import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x >= 0 && y >= 0) {
			if(x >= y) {
				System.out.println(x - y + 2);
			} else {
				System.out.println(y - x);
			}
		} else if(x >= 0) {
			if(x >= Math.abs(y)) {
				System.out.println(1 + x - Math.abs(y));
			} else {
				System.out.println(1 + Math.abs(y)- x);
			}
		} else if(y >= 0) {
			if(Math.abs(x) >= y) {
				System.out.println(Math.abs(x) - y);
			} else {
				System.out.println(y - Math.abs(x));
			}
		} else {
			if(x >= y) {
				System.out.println(Math.abs(y) - Math.abs(x) + 2);
			} else {
				System.out.println(y - x);
			}
		}
	}
}
