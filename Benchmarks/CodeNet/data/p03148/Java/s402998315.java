import java.util.*;

class Main {
	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {
		    @Override
		    public int compare(Integer o1, Integer o2) {
		        return Integer.compare(o2, o1);
		    }
		};
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<PriorityQueue<Integer>> kind = new ArrayList<PriorityQueue<Integer>>();
		for (int i=0;i<N;i++) {
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>(comparator);
			kind.add(queue);
		}
		for (int i=0;i<N;i++) {
			int t = Integer.parseInt(sc.next());
			int d = Integer.parseInt(sc.next());
			int[] tmp = {t, d};
			kind.get(t-1).add(d);
		}

		// best: most delicious of each kind
		PriorityQueue<Integer> best = new PriorityQueue<Integer>(comparator);
		// remain : remain without best
		PriorityQueue<Integer> remain = new PriorityQueue<Integer>(comparator);

		for (int i=0;i<N;i++) {
			if (!kind.get(i).isEmpty()) {
				best.add(kind.get(i).remove());

				while (!kind.get(i).isEmpty()) {
					remain.add(kind.get(i).remove());
				}
			}
		}

		ArrayList<Long> bsum = new ArrayList<Long>();
		bsum.add(0L);
		long bsum_value=0L;
		while (!best.isEmpty()) {
			long tmp = bsum_value+best.remove();
			bsum.add(tmp);
			bsum_value=tmp;
		}

		ArrayList<Long> rsum = new ArrayList<Long>();
		rsum.add(0L);
		long rsum_value=0L;
		while (!remain.isEmpty()) {
			long tmp = rsum_value+remain.remove();
			rsum.add(tmp);
			rsum_value=tmp;
		}

		long ans = 0;
		for (int x=1;x<=K;++x) {
			if (x>=bsum.size()) {
				break;
			}
			if (K-x >= rsum.size()) {
				continue;
			}
			ans = Math.max(ans, bsum.get(x)+rsum.get(K-x)+x*x);
		}
		System.out.println(ans);
	}
}