
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(new InputStreamReader(System.in));
		int a = s.nextInt();
		a = a + (a*a) + (a*a*a);
		System.out.println(a);
	}
}