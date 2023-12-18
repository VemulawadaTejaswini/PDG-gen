import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long N = sc.nextInt();
        long max = 0;
        
        for(long x  = 1; x <= N; x++) {
        	long Ax_B;
        	long x_B;
        	Ax_B =  (long) Math.floor((double)A / (double)B * (double)x);
        	x_B =  (long) Math.floor(1.0 / (double)B * (double)x);
        	long tmpMax = Ax_B - A*x_B;
        	if(tmpMax > max) {
        		max = tmpMax;
        	}        	      	
        }
        
        System.out.print(max);
	}
}

