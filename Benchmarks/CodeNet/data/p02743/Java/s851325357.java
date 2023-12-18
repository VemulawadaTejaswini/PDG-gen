import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (Math.sqrt(c)>Math.sqrt(b)+Math.sqrt(a)) System.out.println("Yes");
		else System.out.println("No");
	}
}
