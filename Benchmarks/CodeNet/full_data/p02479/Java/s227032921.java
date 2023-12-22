import java.util.Scanner;
import static java.lang.Math.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r,s,c;
		r=sc.nextDouble();
		s=r*r*PI;
		c=r*2*PI;
		System.out.printf("%6f %6f\n" ,s,c);
	}

}