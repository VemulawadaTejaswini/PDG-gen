import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		String S = reader.next();
		char[] arr = S.toCharArray();
		int min = 30000;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] == 'W') {
					count++;
				}
			}
			for (int j = i + 1; j < N; j++) {
				if (arr[j] == 'E') {
					count++;
				}
			}
			if (count < min) {
				min = count;
			}
		}

		reader.close();
		System.out.print(min);
	}
}

