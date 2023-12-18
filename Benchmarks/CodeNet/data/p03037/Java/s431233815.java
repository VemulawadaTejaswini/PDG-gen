import java.util.HashSet;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int cardNums[] = new int[2 * M + 1];

		for ( int i = 1; i <= M; i++ ) {
			cardNums[i] = in.nextInt();
			cardNums[i + M] = in.nextInt();
		}

		HashSet<Integer> set = new HashSet<>();
		for ( int i = cardNums[1]; i <= cardNums[M + 1]; i++ ) {
			set.add(i);
		}

		HashSet<Integer> tmp = new HashSet<>();

		for ( int i = 2; i <= M; i++ ) {

			for ( int j = cardNums[i]; j <= cardNums[i + M]; j++ ) {
				if ( set.contains(j) ) {
					tmp.add(j);
				}
			}
			set.clear();
			set = (HashSet<Integer>) tmp.clone();
			tmp.clear();
		}
		System.out.println(set.size());

		in.close();
	}
}
