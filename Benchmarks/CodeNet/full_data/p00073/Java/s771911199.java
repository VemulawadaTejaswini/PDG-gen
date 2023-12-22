import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Double> result = new ArrayList<Double>();
		
		int x = stdIn.nextInt(), h = stdIn.nextInt();
		while( x != 0 || h != 0 ){
			double th = (double)x*x/4 + h*h;
			double a = Math.sqrt(th);
			double b = 2*a*x+x*x;
			result.add(b);
			x = stdIn.nextInt();
			h = stdIn.nextInt();
		}
		
		for(Double ans : result){
			System.out.printf("%.6f%n", ans);
		}
	}
}