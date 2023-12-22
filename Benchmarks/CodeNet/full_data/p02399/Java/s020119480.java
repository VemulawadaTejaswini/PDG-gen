import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r,pi;
		r=sc.nextDouble();
		pi=Math.PI;
		System.out.println(String.format("%.8f", (pi*r*r)) +" "+ String.format("%.8f",(2*pi*r)));
	}
}

