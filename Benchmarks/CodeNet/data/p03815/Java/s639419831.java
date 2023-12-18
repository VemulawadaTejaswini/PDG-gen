import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();
		long k = x / 11;
		long ans = k * 2;
		long r = x - 11 * k;
		if(r == 0) {
			System.out.println(ans);
		}else if(r <= 6) {
			System.out.println(ans + 1);
		}else {
			System.out.println(ans + 2);
		}
	}
}