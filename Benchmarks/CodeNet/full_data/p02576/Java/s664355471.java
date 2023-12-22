import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var x = sc.nextInt();
		var t = sc.nextInt();
		sc.close();

		var result = (int)Math.ceil(n / (double)x) * t;
		System.out.println(result);
	}
}
