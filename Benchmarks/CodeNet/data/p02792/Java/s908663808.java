import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long res = 0;
		int length = String.valueOf(N).length();
		for (int i = 0; i <= N; i++) {
			String tmp = String.valueOf(i);
			int start = tmp.charAt(0) - 48;
			int end = tmp.charAt(tmp.length() - 1) - 48;
			if (end == 0) {
				continue;
			}
			if (start == end) {
				res++;
			}
			for (int j = 0; j < length - 1; j++) {
				int sum = (int) (end * Math.pow(10, j + 1)) + start;
				if (j > 0) {
					for (int k = 0; k < Math.pow(10, j); k++) {
						if (sum + k * 10 < N) {
							res++;
						} else {
							break;
						}
					}
				} else {
					if (sum < N) {
						res++;
					}
				}
			}
		}
		System.out.print(res);
	}
}