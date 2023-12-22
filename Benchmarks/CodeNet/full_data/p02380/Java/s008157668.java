import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		int C    = Integer.parseInt(sc.next());
		double radian = StrictMath.toRadians(C);
		
		double area = a * b * Math.sin(radian) / 2;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(radian));
		double height = 2 * area / a;
		double length = a + b + c;

		System.out.println(String.format("%.8f", area));
		System.out.println(String.format("%.8f", length));
		System.out.println(String.format("%.8f", height));

		
		sc.close();
		
		
	}

}

