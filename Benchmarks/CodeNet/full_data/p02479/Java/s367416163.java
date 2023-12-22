import java.util.*;

class Main{
    public static void main(String[] args){
	double x;
	Scanner sc = new Scanner(System.in);
	x = sc.nextDouble();
	System.out.printf("%.6f ", Math.PI*x*x);
	System.out.printf("%.6f\n", 2.0*Math.PI*x);
    }
}