import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int max = 0;
		for (int i = 1; i < N - 1; i++) {
			String X = S.substring(0, i);
			String Y = S.substring(i);
			int result = 0;
			int min = Math.min(X.length(), Y.length());
			for (int j = 0; j < 26 && result < min; j++) {
				char alphbet = (char) ((char)'a' + j);
				if (X.contains(String.valueOf(alphbet)) && Y.contains(String.valueOf(alphbet))) {
					result++;
				}
			}
			max = Math.max(max, result);
		}
		System.out.println(max);
	}
}
