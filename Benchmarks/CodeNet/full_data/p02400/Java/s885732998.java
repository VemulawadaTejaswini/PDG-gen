import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float r = scan.nextFloat();
		System.out.printf("%.5f %.5f", r * r * Math.PI, r * 2 * Math.PI);
	}

}