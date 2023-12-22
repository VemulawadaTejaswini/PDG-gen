import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		sc.close();

		var result = (10000 - n) % 1000;
		System.out.println(result);
	}
}
