import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(" ");
		for(int i = 3; i <= n; i += 3)
			System.out.print(i + " ");

		System.out.println("");
	}
}