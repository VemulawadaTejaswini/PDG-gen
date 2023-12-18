import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> vs = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			vs.add(new ArrayList<Integer>());
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		int basew = 0;

		for (int i = 0; i < n; i++) {
			int w = sc.nextInt();
			int v = sc.nextInt();

			if (i == 0) basew = w;

			vs.get(w - basew).add(v);			
		}

		ArrayList<ArrayList<Integer>> accs = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			ArrayList<Integer> v = new ArrayList<Integer>();
			v.add(0);
			accs.add(v);
		}

		for (int i = 0; i < 4; i++) {
			vs.get(i).sort(Comparator.reverseOrder());
			for (int j = 0; j < vs.get(i).size(); j++) {
				int accum = accs.get(i).get(j) + vs.get(i).get(j);
				accs.get(i).add(accum);
			}
		}

		int maxv = 0;
		for (int i = 0; i < accs.get(0).size(); i++) {
		for (int j = 0; j < accs.get(1).size(); j++) {
		for (int k = 0; k < accs.get(2).size(); k++) {
		for (int l = 0; l < accs.get(3).size(); l++) {
			int w = basew * i + (basew + 1) * j +
			        (basew + 2) * k + (basew + 3) * l;
 			int v = accs.get(0).get(i) +
			        accs.get(1).get(j) +
			        accs.get(2).get(k) +
			        accs.get(3).get(l);
			if (w <= W) {
				if (maxv < v) {
					maxv = v;
				}
			}
		}}}}

		System.out.println(maxv);
	}
}
