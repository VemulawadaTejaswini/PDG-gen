import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		
		double area = r * r * Math.PI;
		double circle = (r + r) * Math.PI;
		
		System.out.println(area + " " + circle);
	}
}