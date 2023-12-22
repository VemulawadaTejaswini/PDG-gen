import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println(calcEuclidDistance(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		
	}
	
	static double calcEuclidDistance (double x1, double y1, double x2, double y2) {
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return d;
	}
	
}
