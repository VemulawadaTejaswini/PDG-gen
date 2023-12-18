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
			System.out.println(1 + x - Math.abs(y));
		} else if(y >= 0) {
			System.out.println(y - x);
		} else {
			if(x >= y) {
				System.out.println(Math.abs(y) - Math.abs(x) + 2);
			} else {
				System.out.println(y - x);
			}
		}
	}
}
