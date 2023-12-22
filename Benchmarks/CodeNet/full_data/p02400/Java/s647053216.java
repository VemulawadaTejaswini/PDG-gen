import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r;
		double l, s;
		
		r = sc.nextInt();
		
		l = 2 * (double)r * Math.PI;
		s = (double)r * (double)r * Math.PI;
		
		System.out.printf("%.5f %.5f\n", s, l);
	}
}