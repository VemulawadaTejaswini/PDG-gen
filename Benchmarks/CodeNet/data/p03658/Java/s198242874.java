import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		Integer[] l = new Integer[N];
		for (int i = 0; i < N; i++) {
			l[i] = Integer.parseInt(sc.next());
		}

		int result = 0;
        Arrays.sort(l, Comparator.reverseOrder());
		for (int i = 0; i < K; i++) {
			result += l[i];
		}
		System.out.println(result);
	}
}