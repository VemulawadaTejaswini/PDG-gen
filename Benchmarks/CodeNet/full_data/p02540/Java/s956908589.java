import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long n = Long.parseLong(N); 
        
        long m = 0;
        long sum = 0;
        long i = 0;
        while(true){
            m++;
            double c =  -2*m*n;
            double[] sols = method(1, 1,c);
            if(sols[0] > 0 && (int)(sols[0]) - sols[0] == 0){
                i = (int)(sols[0]);
                break;
            }
            if(sols[1] > 0 && (int)(sols[1]) - sols[0] == 0){
                i = (int)(sols[1]);
                break;
            }
        }
        
        System.out.println(i);
        
    }
    
    static double[] method(double a, double b, double c) {
		double[] x = {0,0};
		double d2=0, d=0;
		d2 = b*b - 4*a*c;
		if (d2 >= 0) {
			d = Math.sqrt(d2);
			x[0] = (-b + d)/(2*a);
			x[1] = (-b - d)/(2*a);
		} 
		return x;
	}
}