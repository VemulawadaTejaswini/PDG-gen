import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = {1, 1, 0, 2, 0, 0, 1, 0, 1, 0};
		int a = sc.nextInt() % 10;

		System.out.println(n[a] == 0 ? "hon" : n[a] == 1 ? "pon" : "bon");
	}
}