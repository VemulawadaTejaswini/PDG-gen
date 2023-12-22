import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float x1, y1, x2, y2;
		x1 = scan.nextFloat();
		y1 = scan.nextFloat();
		x2 = scan.nextFloat();
		y2 = scan.nextFloat();
		
		double d = Math.sqrt((x2 * x2 - x1 * x1) + (y2 * y2 - y1 * y1));
		System.out.println(d);
		
	}

}