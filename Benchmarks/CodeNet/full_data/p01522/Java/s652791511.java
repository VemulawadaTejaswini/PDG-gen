
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		List<Set<Integer>> bs = new ArrayList<Set<Integer>>();
		int size = 0;
		for (int bt = 0; bt < n; bt += size) {
			Set<Integer> set = new HashSet<Integer>();
			size = in.nextInt();
			for (int i = 0; i < size; i++) {
				set.add(in.nextInt());
			}
			bs.add(set);
		}
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> pear = new HashSet<Integer>();
		int r = in.nextInt();
		for (int p = 0; p < r; p++) {
			pear.clear();
			pear.add(in.nextInt());
			pear.add(in.nextInt());
			for (Set<Integer> check : bs) {
				if (check.containsAll(pear)) {
					a.addAll(pear);
				}
			}
		}
		System.out.println(a.size());
	}
}