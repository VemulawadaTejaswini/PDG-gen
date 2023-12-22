import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		r=sc.nextDouble();
		System.out.println(r*r*Math.PI +" "+ r*2*Math.PI);
	}
}