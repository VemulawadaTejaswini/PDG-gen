import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] scores = new Integer[N];
		for(int i = 0; i < N; i++) {
			scores[i] = sc.nextInt();
		}

		Arrays.sort(scores, Comparator.reverseOrder());
		int in = 0;
		loop :for(int i = 0; i < N; i++) {
			for(int u = 0; u < N; u++) {
				if(scores[i].equals(scores[u])) {
					in += 1;
				}
				if(scores[i] < in) {
					System.out.println(scores[i]);
					break loop;
				}
			}
		}
	}
}