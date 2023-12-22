import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int ang = 90;
		for(;;){
			int d = scan.nextInt();
			int a = scan.nextInt();
			if(d == 0 && a == 0){
				break;
			}
			double x = (double) d * Math.cos(Math.toRadians((double) ang));
			double y = (double) d * Math.sin(Math.toRadians((double) ang));
		}

		System.out.printf("%d\n", (int) x);
		System.out.printf("%d\n", (int) y);
	}
}