import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long power = 1;

		for(int i = 1; i <= N; i++) {
			power = i * power % ((int)Math.pow(10,9) +7);
		}
		System.out.println(power);
	}
}
