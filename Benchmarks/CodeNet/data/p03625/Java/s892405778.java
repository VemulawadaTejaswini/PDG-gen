import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Integer[] a = new Integer[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		int count = 0;
		int sum = 1;
		for (int i = 0; i < a.length - 1;) {
			if (a[i].equals(a[i + 1])) {
				sum *= a[i];
				count++;
				if (count == 2) {
					break;
				}
				i += 2;
			} else {
				i++;
			}
		}
		System.out.println(count != 2 ? 0 : sum);
		in.close();
	}

}