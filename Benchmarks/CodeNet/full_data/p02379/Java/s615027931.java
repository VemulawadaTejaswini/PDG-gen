import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		double p1_x, p1_y, p2_x, p2_y, dis;
		
		p1_x = scan.nextDouble();
		p1_y = scan.nextDouble();
		p2_x = scan.nextDouble();
		p2_y = scan.nextDouble();
		
		dis = Math.pow((p2_x - p1_x), 2) + Math.pow((p2_y - p1_y), 2);
		dis = Math.sqrt(dis);
		
		System.out.println(dis);
		
		scan.close();
	}
}

