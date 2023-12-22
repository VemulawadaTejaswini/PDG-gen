import java.util.Scanner;
 
public class Main {
 
	
    public static void main(String[] args){
    	double PI = 3.141592653589;
    	Scanner sc = new Scanner(System.in);
    	int r = sc.nextInt();
    	double f = (double)r*(double)r*PI;
    	double l = 2*PI*r;
    	System.out.println(String.format("%.6f", f)+" "+String.format("%.6f", l));

    }
}