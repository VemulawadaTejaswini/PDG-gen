import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		sc.close();
		int result = G * 2 - R;
		System.out.println(result);
	}
}