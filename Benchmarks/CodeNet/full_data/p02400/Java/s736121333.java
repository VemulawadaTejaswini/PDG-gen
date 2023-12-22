import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double PI = Math.PI;
     	double r = sc.nextDouble();

	System.out.println(PI*r*r+" "+2*PI*r);
     	
	sc.close();
	}
}