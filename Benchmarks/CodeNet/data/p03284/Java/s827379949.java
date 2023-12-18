import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int participant = sc.nextInt();

		System.out.println(total% participant);
	}
}
