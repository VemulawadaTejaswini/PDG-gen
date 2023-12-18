import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt();
		int s = (int)Math.sqrt(n);
		System.out.println(s * s);
	}
}