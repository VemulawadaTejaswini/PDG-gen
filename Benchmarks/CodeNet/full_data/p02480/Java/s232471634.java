import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int tmpx = x;
		x *= tmpx;
		x *= tmpx;
		System.out.println(x);
	}
}