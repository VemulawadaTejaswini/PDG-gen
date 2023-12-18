import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		TreeSet<Integer> set = new TreeSet<>();
		int bi = 0;
		while (s.indexOf("AC", bi) != -1) {
			set.add(s.indexOf("AC", bi));
			bi = s.indexOf("AC", bi) + 1;
		}
		for (int i = 0; i < q; i++) {
			SortedSet<Integer> subset = set.subSet(l[i] - 1, r[i] - 1);
			System.out.println(subset.size());
		}
	}
}