import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		y+= y+1;
		System.out.println((int)Math.ceil(x/y));

	}

}
