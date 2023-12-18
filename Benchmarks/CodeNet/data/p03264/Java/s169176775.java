import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int o = k / 2;
		int e = k - o;
		System.out.println(o * e);
	}
}