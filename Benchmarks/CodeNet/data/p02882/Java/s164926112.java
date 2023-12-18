import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
      	double b = sc.nextDouble();
        double x = sc.nextDouble();
        System.out.println((a*a*b/2<=x)?180*Math.atan(2*(a*a*b-x)/(a*a*a))/Math.PI:180*Math.atan(a*b*b/(2*x))/Math.PI);
    }
}