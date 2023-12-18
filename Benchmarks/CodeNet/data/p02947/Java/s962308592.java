import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] f = new int[n];
		long[] snum = new long[n];

		long total = 0l;

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			snum[i] = 1;
			char[] chars = s[i].toCharArray();
			for (int j = 0; j < 10; j++) {
				if (chars[j] == 'a') {
					snum[i] *= 2;
				} else if (chars[j] == 'b') {
					snum[i] *= 3;
				} else if (chars[j] == 'c') {
					snum[i] *= 5;
				} else if (chars[j] == 'd') {
					snum[i] *= 7;
				} else if (chars[j] == 'e') {
					snum[i] *= 9;
				} else if (chars[j] == 'f') {
					snum[i] *= 11;
				} else if (chars[j] == 'g') {
					snum[i] *= 13;
				} else if (chars[j] == 'h') {
					snum[i] *= 17;
				} else if (chars[j] == 'i') {
					snum[i] *= 19;
				} else if (chars[j] == 'j') {
					snum[i] *= 23;
				} else if (chars[j] == 'k') {
					snum[i] *= 29;
				} else if (chars[j] == 'l') {
					snum[i] *= 31;
				} else if (chars[j] == 'm') {
					snum[i] *= 37;
				} else if (chars[j] == 'n') {
					snum[i] *= 41;
				} else if (chars[j] == 'o') {
					snum[i] *= 43;
				} else if (chars[j] == 'p') {
					snum[i] *= 47;
				} else if (chars[j] == 'q') {
					snum[i] *= 53;
				} else if (chars[j] == 'r') {
					snum[i] *= 59;
				} else if (chars[j] == 's') {
					snum[i] *= 61;
				} else if (chars[j] == 't') {
					snum[i] *= 67;
				} else if (chars[j] == 'u') {
					snum[i] *= 71;
				} else if (chars[j] == 'v') {
					snum[i] *= 73;
				} else if (chars[j] == 'w') {
					snum[i] *= 79;
				} else if (chars[j] == 'x') {
					snum[i] *= 83;
				} else if (chars[j] == 'y') {
					snum[i] *= 89;
				} else if (chars[j] == 'z') {
					snum[i] *= 1;
				}
			}
		}

		for (int i = 0; i < n - 1; i++) {
			int count = 0;
			if (f[i] != 0) {
				continue;
			} else {
				for (int j = i + 1; j < n; j++) {
					if (snum[i] == snum[j]) {
						count++;
						f[j] = -1;
					}
				}
				total += (long) sum(count);
			}

		}
		System.out.println(total);
		sc.close();

	}

	public static long sum(int num) {
		long ret = 0;
		for (int i = 1; i <= num; i++) {
			ret += i;
		}
		return ret;
	}

}