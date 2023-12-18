import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		b = b - a;
		int cnt = 1;
		while (b > 0) {
			b = b - a + 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}