import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextInt();
		long M = 0;
		if (N%2 == 1) {
			for (long i = 1; i < 100; i += 2) {
				for (long j = -100; j < 100; j += 2) {
					M = i*i*i*i*i-j*j*j*j*j;
					if (M == N) {
						System.out.println(i + " " + j);
						break;
					}
				}
				break;
			}
		} else if (N == 0) {
			System.out.println(0 + " " + 0);
		} else {
			for (long i = 0; i < 100; i ++) {
				for (long j = -100; j < 100; j ++) {
					M = i*i*i*i*i-j*j*j*j*j;
					if (M == N) {
						System.out.println(i + " " + j);
						break;
					}
				}
				break;
			}
		}
	}
}