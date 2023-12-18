import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		if (a - 999 <= 0)
			System.out.print("ABC");
		else
			System.out.print("ABD");
	}
}