import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];
		int number[] = new int[N];
		for (int i = 0; i < N; i++) {
			number[i] = 0;
		}
		int count = 0;
		int first = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			boolean b = false;
			for (int j = 0; j < count; j++) {
				if (str.equals(S[j])) {
					number[j]++;
					if (first < number[j]) {
						first = number[j];
					}
					b = true;
				}
			}
			if (b == false) {
				S[count] = str;
				count++;
			}
		}

		int fc = 0;
		for (int i = 0; i < N; i++) {
			if (first == number[i]) {
				fc++;
			}
		}
		//		for (int i = 0; i < N; i++) {
		//			if (number[i] == first) {
		//				System.out.println(S[i]);
		//			}
		//		}
		String[] SS = new String[fc];
		int k = 0;
		for (int i = 0; i < N; i++) {
			if (number[i] == first) {
				SS[k] = S[i];
				k++;
			}
		}
		Arrays.sort(SS);

		for (String s : SS) {
			System.out.println(s);
		}
	}
}
