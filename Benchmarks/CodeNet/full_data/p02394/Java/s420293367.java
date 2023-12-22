
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		boolean b1 = false;
		boolean b2 = false;

		if(x-r < 0 || W < x+r) {
			System.out.println("No");
		}
		if(y-r < 0 || H < y+r) {
			System.out.println("No");
		}

		if(x-r > 0 && W > x+r){
		//	System.out.println("Yes");
			b1 = true;
		}
		if(y-r > 0 && H > y+r){
		//	System.out.println("Yes");
			b2 = true;
		}
		if(b1 && b2) {
			System.out.println("Yes");
		}
	}
}