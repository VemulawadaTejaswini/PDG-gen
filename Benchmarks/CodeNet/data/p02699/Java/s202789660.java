import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static PrintStream o = System.out;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int w = sc.nextInt();
		if (s > w) {
			o.println("safe");
		} else {
			o.println("unsafe");
		}
	}
}