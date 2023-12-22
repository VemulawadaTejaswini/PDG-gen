import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int s = 0;
		while ( (n=sc.nextInt()) != 0 | (s=sc.nextInt()) != 0) {
			if (s > 45) {
				System.out.println(0);
				continue;
			}
			int count = 0;
			HashSet< LinkedList<Integer> > combs = choose(n);
			for (LinkedList<Integer> seq : combs) {
				int sum = 0;
				for (int i : seq) {
					sum += i;
				}
				if (sum == s) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static HashSet< LinkedList<Integer> > choose(int n) {
		if (n == 1) {
			HashSet< LinkedList<Integer> > combs = new HashSet<>();
			for (int i=0; i < 10; i++) {
				LinkedList<Integer> seq = new LinkedList<>();
				seq.add(i);
				combs.add(seq);
			}
			return combs;
		}

		if (n > 1) {
			HashSet< LinkedList<Integer> > combs = choose(n-1);
			HashSet< LinkedList<Integer> > newcombs = new HashSet<>();
			for (LinkedList<Integer> seq : combs) {
				int last = seq.get(seq.size()-1);
				if ( last < 9 ) {
					for (int i = last+1; i < 10; i++) {
						LinkedList<Integer> newseq = new LinkedList<>(seq);
						newseq.add(i);
						newcombs.add(newseq);
					}
				}
			}
			return newcombs;
		}

		return null;
	}
}