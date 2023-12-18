
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		int V = 1000000000;

		long x = S == V ? 0 : V - S%V;
		long y = (x + S)/V;
		System.out.println("0 0 " + V + " 1 " + x + " " + y);
	}
}