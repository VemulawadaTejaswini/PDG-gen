import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = 3.141592653589;
		int r = sc.nextInt();

		System.out.println(r*r*p + " " + 2*r*p);
	}
}