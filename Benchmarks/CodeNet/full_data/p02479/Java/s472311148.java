import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI;
	double r = sc.nextDouble();
	double area = (2*r*pi);
	double length = ( pi*r*r);
	System.out.printf("%f %f",area,length  );
	}
}