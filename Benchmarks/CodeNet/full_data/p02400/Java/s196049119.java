import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		System.out.printf("%.6f\n", r * r * Math.PI);
		System.out.printf("%.6f\n", r * 2  * Math.PI);
	}
}