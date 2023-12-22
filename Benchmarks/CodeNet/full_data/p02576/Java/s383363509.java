import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		int i = 0;
		for(;n > 0; i++) {
			n -= x;
		}
		System.out.println(i * t);
	}
}
