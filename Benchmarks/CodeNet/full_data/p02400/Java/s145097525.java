import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	double r;
	double cir,area;

	r = sc.nextDouble();
	cir = 2*Math.PI*r;
	area = Math.PI*r*r;

	System.out.printf("%.6f %.6f", cir,area);
	sc.close();
	}
}