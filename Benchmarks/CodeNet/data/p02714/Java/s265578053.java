import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		int g = 0;
		int b = 0;
		long result = 0;
		long exception = 0;
		char[] c = sc.next().toCharArray();

		for(char var : c) {
			switch (var) {
			case 'R':
				r++;
				break;
			case 'G':
				g++;
				break;
			case 'B':
				b++;
				break;
			}
		}

		result = r * g * b;

		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				int k = j + (j - i);
				if(k >= n) break;
				if(c[i] != c[j] && c[j] != c[k] && c[k] != c[i]) exception++;
			}
		}

		System.out.println(result - exception);

		sc.close();
	}
}
