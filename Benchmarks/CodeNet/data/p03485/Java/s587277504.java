import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = (sc.nextDouble() + sc.nextDouble()) / 2.0;
		System.out.println((int)Math.ceil(d));
	}
}
