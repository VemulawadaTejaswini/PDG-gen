import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	double b = sc.nextDouble();
    	double x=Math.PI;
    	double a = b*2*x;
    	double c = b*b*x;
    	sb.append(String.format("%6.6f",c)).append(" ").append(String.format("%6.6f",a));
    	System.out.print(sb);
    }
}