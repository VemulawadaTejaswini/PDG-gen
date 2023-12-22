import java.util.Scanner;
 
public class Main {
 
	
    public static void main(String[] args){
    	double PI = 3.141592653589;
    	Scanner sc = new Scanner(System.in);
    	double r = sc.nextDouble();
    	double f = (double)r*(double)r*(double)PI;
    	double l = 2*(double)PI*(double)r;
    	System.out.println(String.format("%.6f", f)+" "+String.format("%.6f", l));

    }
}