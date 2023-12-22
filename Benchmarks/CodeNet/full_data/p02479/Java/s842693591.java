import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float r = scan.nextFloat();
		System.out.print(r * r * Math.PI);
		System.out.print(" ");
		System.out.println(r * 2 * Math.PI);

	}

}