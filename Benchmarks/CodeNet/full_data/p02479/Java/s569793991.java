import java.util.Scanner;

public class Circle1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r =sc.nextDouble();
		System.out.printf("%f %f\n",Math.PI*r*r,2*Math.PI*r);
	}
}