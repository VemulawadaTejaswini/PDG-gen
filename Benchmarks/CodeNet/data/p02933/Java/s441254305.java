import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String k = sc.next();

		System.out.println(t >= 3200 ? k : "red");

	}

}