import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = 999;
		int y = 999;
		
		while(x != 0 && y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0) {
				break;
			} else if(x > y) {
				System.out.println(x + " " + y);
			} else if(x < y) {
				System.out.println(y + " " + x);
			} else if(x == y) {
				System.out.println(x + " " + y);
			}
		}
	
	}
}