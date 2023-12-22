
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		scan.close();
		
		double aDeg = ((double)h / 12 * 360 + (double) m / 60 * 30) % 360;
		double bDeg = ((double)m / 60 * 360) % 360;
		
		double deg = Math.abs(aDeg - bDeg);
		
		double answer = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(deg)));
		
		//System.out.println(aDeg);
		//System.out.println(bDeg);
		//System.out.println(deg);
		
		System.out.println(answer);
		
		
		
	}

}
