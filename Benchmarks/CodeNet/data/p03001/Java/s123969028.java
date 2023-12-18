import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double minAria = 0;
		int mult = 0;
		double minx = Math.min(x, w - x) * h;
		double miny = Math.min(y, h - y) * w;
		minAria = Math.max(minx, miny);
		if(minx == miny) mult = 1;
		System.out.println(minAria + " " + mult);
	}
}
