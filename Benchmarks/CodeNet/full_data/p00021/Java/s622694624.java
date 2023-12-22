import java.util.*;

class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int rept = in.nextInt();
		while(rept-- > 0){
			double x1 = in.nextDouble(), y1 = in.nextDouble(),
					x2 = in.nextDouble(), y2 = in.nextDouble(),
					x3 = in.nextDouble(), y3 = in.nextDouble(),
					x4 = in.nextDouble(), y4 = in.nextDouble();
			double p1 = x2 - x1, p2 = y2 - y1, q1 = x4 - x3, q2 = y4 - y3;
			if(Math.abs(p1*q2 - p2*q1)<1e-5)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}