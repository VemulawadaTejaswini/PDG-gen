import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Double d = scan.nextDouble();
		int count = 0;
		while (t-- > 0) {
			Double a = scan.nextDouble();
			Double b = scan.nextDouble();
			Double dis = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			if (dis <= d) {
				count++;
			}
		}
		System.out.println(count);
	}
}
