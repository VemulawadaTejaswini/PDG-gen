import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		b *= 100;
		
		System.out.println(((long) (a * b)) / 100);
		
		sc.close();
	}
}


