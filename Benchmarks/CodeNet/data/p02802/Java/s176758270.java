import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] solved = new boolean[N];
		Arrays.fill(solved, false);

		int penalty = 0;
		for (int i=0;i<M;i++) {
			int p = sc.nextInt()-1;
			String S = sc.next();

			if (S.equals("AC")) {
				solved[p] = true;
			} else { // S.equals("WA")
				if (!solved[p]) penalty++;
			}
		}

		int accepted = 0;
		for (int i=0;i<N;i++) {
			if (solved[i]) accepted++;
		}
		System.out.println(accepted+" "+penalty);
	}
}