import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(String.format("a %s b", a > b ? ">" : a < b ? "<" : "=="));
	}
}

