import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveD();
	}

    private void solveD() {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		int min = sum(K);
		for (long l = 1; l < pow(min); l++) {
			int tmp = sum(l*K);
			if (min > tmp) {
				min = tmp;
			}
		}
		System.out.println(min);
	}

	private long pow(int digit) {
		long ret = 1;
		for (int i = 0; i < digit; i++) {
			ret *= 10;
		}
		return ret;
	}

	private int sum(long num) {
		int ret = 0;
		while (num > 0) {
			ret += num % 10;
			num /= 10;
		}
		return ret;
	}
}