import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double ans = l * l * l / 27;
		System.out.println(ans);
		sc.close();
	}
}