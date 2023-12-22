import java.util.Scanner;

public class Main{
	    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	double a = scan.nextDouble();
    	System.out.printf("%f %f",Math.PI*2*a,Math.PI*a*a);
    }
}