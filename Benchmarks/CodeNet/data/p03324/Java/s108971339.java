import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		if(d == 0 && n == 100) {
			System.out.println(101);
		} else {
			System.out.println((int)Math.pow(100, d) * n);
		}
	}
}
