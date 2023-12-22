import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		scan.close();
		
		printCoordinate (0.0, 0.0);
		kock (n, 0.0, 0.0, 100.0, 0.0);
		printCoordinate (100.0, 0.0);
		
	}
	
	static void kock (int n, double p1_x, double p1_y , double p2_x, double p2_y) {
		
		if (n == 0) return;
		
		double s_x = (2 * p1_x + 1 * p2_x) / 3;
		double s_y = (2 * p1_y + 1 * p2_y) / 3;
		
		double t_x = (1 * p1_x + 2 * p2_x) / 3;
		double t_y = (1 * p1_y + 2 * p2_y) / 3;
		
		double u_x = (t_x - s_x) * Math.cos(60 * (Math.PI / 180))
				- (t_y - s_y) * Math.sin(60 * (Math.PI / 180)) + s_x;
		double u_y = (t_x - s_x) * Math.sin(60 * (Math.PI / 180))
				+ (t_y - s_y) * Math.cos(60 * (Math.PI / 180)) + s_y;
				
		kock ( n - 1, p1_x, p1_y, s_x, s_y);
		printCoordinate (s_x, s_y);
		
		kock ( n - 1, s_x, s_y, u_x, u_y);
		printCoordinate (u_x, u_y);
		
		kock (n - 1, u_x, u_y, t_x, t_y);
		printCoordinate (t_x, t_y);
		
		kock ( n - 1, t_x, t_y, p2_x, p2_y);
		
		
	}
	
	static void printCoordinate (double x, double y) {
		System.out.println (x + " " + y);
	}
}

