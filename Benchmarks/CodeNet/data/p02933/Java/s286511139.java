
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String s = sc.next();

		System.out.print(a >= 3200 ? s : "red");
	}
}