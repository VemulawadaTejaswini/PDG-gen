import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = 1;
		final double PI = Math.acos(0);
		//t = input.nextInt();
		while(t-- > 0) {
			int n = 0;
			n = input.nextInt();
			System.out.println((double)n * 2 * Math.PI);
		}
	}
}
