import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		
		//double area = r * r * Math.PI;
		//double circle = (r + r) * Math.PI;
		double area = r * r * 3.141592653589793;
		double circle = (r + r) * 3.141592653589793;
		
		System.out.println(area + " " + circle);
	}
}