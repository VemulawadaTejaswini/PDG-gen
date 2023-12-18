import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var r = sc.nextInt();
		sc.close();

		System.out.println(3.14159 * r * 2);
	}
}