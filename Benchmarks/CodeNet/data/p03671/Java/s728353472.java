import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;
		if(a >= b && b >= c) {
			cnt = a + b;
		} else if(b >= c && c >= a) {
			cnt = b + c;
		} else if(c >= a && a >= b) {
			cnt = c + a;
		}
		System.out.println(cnt);
	}
}
