import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long answer = 0;

		while (H != 0) {
			H /= 2;
			answer++;
		}

		System.out.println((long)Math.pow(2, answer)-1);
	}
}