import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextInt();
		double w = sc.nextInt();
		double n = sc.nextInt();

		int a = (int) Math.ceil(n/h);
		int b = (int) Math.ceil(n/w);

		if(a <= b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
}
