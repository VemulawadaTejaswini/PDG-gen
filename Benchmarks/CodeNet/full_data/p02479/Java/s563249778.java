import java.util.Scanner;

public class Circle {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI;
	int r = sc.nextInt();
	double area = (2*r*pi);
	double length = ( pi*r*r);
	System.out.println(area + " "+length);
	}
}