import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double pi = Math.PI;
		double area = r*r*pi;
		double length = 2*r*pi;
		System.out.println(area+" "+length);
	}
}