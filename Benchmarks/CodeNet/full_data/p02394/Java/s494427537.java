import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();
		
		while(W <= 0 || W > 100 || H <= 0 || H > 100 || r <= 0 || r > 100
				|| x < -100 || x > 100 || y < -100 || y > 100){
			W = stdIn.nextInt();
			H = stdIn.nextInt();
			x = stdIn.nextInt();
			y = stdIn.nextInt();
			r = stdIn.nextInt();
		}
		
		if( 0 < x - r && W > x + r && 0 < y - r && H > y + r ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}
