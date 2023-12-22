import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int pass_time = H*60 + M;
      	
		double a = ((double)360/60/12 * (double)pass_time) % 360;
		double b = (360/60 * pass_time) % 360;
 
		double ans = Math.sqrt(A*A + B*B -2*A*B*Math.cos(Math.toRadians(Math.abs(a-b))));
 
		System.out.println(ans);
    }
}
