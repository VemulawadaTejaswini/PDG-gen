//import java.util.Scanner;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
    Scanner var = new Scanner(System.in);
    double r = var.nextDouble();
    double pi= Math.PI;
    double area=pi*r*r;
    double length=2.0000000000*pi*r;
		System.out.println(area+" "+length);
	}
}