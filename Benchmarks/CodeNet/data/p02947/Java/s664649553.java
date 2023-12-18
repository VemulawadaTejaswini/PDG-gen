import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long count = 0;
		int itr = 0;
		int n = Integer.parseInt(sc.next());

		String[] line = new String[n];
		char[][] word = new char[n][10];

		for (int i = 0; i < n; i++) {
			word[i] = sc.next().toCharArray();
			Arrays.sort(word[i]);
		}

		for (int i = 0; i < n; i++) {
			line[i] = String.valueOf(word[i]);
		}

		Arrays.sort(line);

		int ren = 1;
		for (int i = 1; i < n; i++) {
			if(line[itr].equals(line[i])) {
				count+=ren;
				ren++;
			} else {
				itr = i;
				ren=1;
			}
		}
		System.out.println(count);

	}
}