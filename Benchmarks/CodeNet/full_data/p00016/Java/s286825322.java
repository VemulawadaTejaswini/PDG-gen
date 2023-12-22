import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		double x = 0;
		double y = 0;
		int ang = 90;
		for(;;){
			int d = scan.nextInt();
			int a = scan.nextInt();
			if(d == 0 && a == 0){
				break;
			}
			x += (double) d * Math.cos(Math.toRadians((double)ang));
			y += (double) d * Math.sin(Math.toRadians((double)ang));
			ang -= a;
		}
		int X = (int) x;
		int Y = (int) y;
		System.out.printf("%d\n", x);
		System.out.printf("%d\n", y);
	}
}