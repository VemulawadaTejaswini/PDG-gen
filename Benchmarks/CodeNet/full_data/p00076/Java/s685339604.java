import java.util.*;

public class Main {
	
	public static final double PI = 3.1415926535897;

	public static void main(String[] args) {
		// Origin = ( -1, 0)
		int num;
		double x, y, rad;
		Scanner scan = new Scanner(System.in);
		while(true) {
			num = scan.nextInt();
			if(num==-1) break;

			x = 1.0; y = 0.0; rad = PI/2.0;
			for( int i=0; i<num-1; i++) {
				x += Math.cos(rad);
				y += Math.sin(rad);
				
				rad = Math.atan2(y, x) + PI/2.0;
			}
			System.out.println(""+x+"\n"+y);
		}
	}
}