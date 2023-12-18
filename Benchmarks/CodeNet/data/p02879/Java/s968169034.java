import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt() * sc.nextInt();
		System.out.println(ans >= 0 ? ans : -1);
	}
}