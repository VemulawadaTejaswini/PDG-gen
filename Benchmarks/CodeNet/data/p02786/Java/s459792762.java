import java.util.Scanner;

public class Main {
	public static long half(long hp) {
		if (hp == 0) {
			return 0;
		} else {
			return 2 * half(hp / 2) + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		System.out.println(half(H));
	}

}
