import java.util.Scanner;

public class Main{
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		double pi=Math.PI;
		double area=pi*r*r;
		double length=2*pi*r;
		System.out.printf("%f %f%n",area,length);
	}
}