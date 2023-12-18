
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] S = new String[N];

		for (int i = 0; i < N; i++) {
			S[i] = scan.next();
		}

		int[] bit = new int[N];
		int[] count = new int[N];
		int max = 0;

		ArrayList<String> anser = new ArrayList<String>();

		for (int i = 0; i < N; i++) {

			int c = 1;

			if (bit[i] == 1) {
				continue;
			}

			for (int j = i + 1; j < N; j++) {
				if (S[i].equals(S[j])) {
					bit[j] = 1;
					c++;
				}
			}
			count[i] = c;
			if (c > max) {
				max = c;
			}
		}
		for (int i = 0; i < N; i++) {
			if (count[i] == max) {
				anser.add(S[i]);
			}
		}
		Collections.sort(anser);
		for (String s : anser)
			System.out.println(s);
	}

}
