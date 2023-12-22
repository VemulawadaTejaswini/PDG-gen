import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int q = scan.nextInt();
		
		double x0, y0, x1, y1, x2, y2, x3, y3, s1, s2;
		
		for(int i = 0; i < q; i++) {
			x0 = scan.nextDouble();
			y0 = scan.nextDouble();
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			
			s1 = ((x3 - x2) * (y0 - y2) - (y3 - y2) * (x0 - x2)) / 2;
			s2 = ((x3 - x2) * (y2 - y1) - (y3 - y2) * (x2 - x1)) / 2;
			
			System.out.print(x0 + (x1 - x0) * s1 / (s1 + s2));
			System.out.print(" ");
			System.out.println(y0 + (y1 - y0) * s1 / (s1 + s2));
		}
		
		scan.close();
	}
}