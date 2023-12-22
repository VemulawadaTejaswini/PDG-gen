import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.println((float)(2*r*Math.PI) + " " +(float)(r*r*Math.PI));
	}
}