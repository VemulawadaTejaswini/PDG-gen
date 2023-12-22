import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		double PI = Math.PI;
		double a = x*x*PI;
		double b = 2*x*PI;
		System.out.println(a + " " +b);
	}
}