import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		System.out.println(r * 2 * Math.PI + " " + Math.pow(2,2) * Math.PI);
	}

}