import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int T = sc.nextInt();
    	int A = sc.nextInt();
    	double near = Double.MAX_VALUE;
    	int num = 0;
    	for (int i = 0; i < N; i++) {
    		double tmp = (T - sc.nextInt() * 0.006) - A;
    		if (Math.abs(tmp) < near) {
    			near = Math.abs(tmp);
    			num = i + 1;
    		}
    	}
    	System.out.println(num);
    }
}