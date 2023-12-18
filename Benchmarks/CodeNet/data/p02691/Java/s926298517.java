import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int[] Aheight = new int[N];
		for (int j = 0; j < N; j++) {
			Aheight[j] = scan.nextInt();
		}

		int count = 0;

		for (int first = 0; first < N-2; first++) {
			for (int number_from_first = Aheight[first] + 1; number_from_first < N - first; number_from_first++) {
				if (number_from_first == Aheight[first+number_from_first] + Aheight[first]) {
					count++;
				}
			}
		}

		System.out.println(count);

	}
}