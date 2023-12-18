import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();

		float tmp = L / 3;

		System.out.println(Math.pow(tmp, 3));
	}
}