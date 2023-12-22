import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	double r = scanner.nextDouble();
    	double x = Math.PI;
    	double y = 2*x*r;
    	double z = x*r*r;
    	System.out.println(String.format("%.6f",y)+" "+String.format("%.6f",z));
    }
}