import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] Nnumber = new int[N];
		for (int i = 0; i < N; i++) {
			Nnumber[i] = i+1;
		}

		int[] Aheight = new int[N];
		for (int j = 0; j < N; j++) {
			Aheight[j] = scan.nextInt();
		}

		int count = 0;

		for (int first = 0; first < N; first++) {
			for (int number_from_first = Aheight[first] + 1; number_from_first < N - first; number_from_first++) {
				if (Nnumber[first+number_from_first] - Nnumber[first] == Aheight[first+number_from_first] + Aheight[first]) {
					count++;
				}
			}
		}

		System.out.println(count);

	}
}