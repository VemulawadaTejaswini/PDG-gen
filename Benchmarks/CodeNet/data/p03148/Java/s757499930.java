import java.util.*;

class Main {
	public static void main(String[] args) {
		Comparator<Long> comparator = new Comparator<Long>() {
		    @Override
		    public int compare(Long o1, Long o2) {
		        return Long.compare(o2, o1);
		    }
		};
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<PriorityQueue<Long>> kind = new ArrayList<PriorityQueue<Long>>();
		for (int i=0;i<N;i++) {
			PriorityQueue<Long> queue = new PriorityQueue<Long>(comparator);
			kind.add(queue);
		}
		for (int i=0;i<N;i++) {
			int t = Integer.parseInt(sc.next());
			long d = Long.parseLong(sc.next());
			kind.get(t-1).add(d);
		}

		// best: most delicious of each kind
		PriorityQueue<Long> best = new PriorityQueue<Long>(comparator);
		// remain : remain without best
		PriorityQueue<Long> remain = new PriorityQueue<Long>(comparator);

		for (int i=0;i<N;i++) {
			if (!kind.get(i).isEmpty()) {
				best.add(kind.get(i).peek());
				kind.get(i).remove();

				while (!kind.get(i).isEmpty()) {
					remain.add(kind.get(i).peek());
					kind.get(i).remove();
				}
			}
		}

		ArrayList<Long> bsum = new ArrayList<Long>();
		bsum.add(0L);
		long bsum_value=0L;
		while (!best.isEmpty()) {
			long tmp = bsum_value+(long)best.peek();
			bsum.add(tmp);
			bsum_value=tmp;
			best.remove();
		}

		ArrayList<Long> rsum = new ArrayList<Long>();
		rsum.add(0L);
		long rsum_value=0L;
		while (!remain.isEmpty()) {
			long tmp = rsum_value+(long)remain.peek();
			rsum.add(tmp);
			rsum_value=tmp;
			remain.remove();
		}

		long ans = 0L;
		for (int x=1;x<=K;x++) {
			if (x>=bsum.size()) {
				break;
			}
			if (K-x >= rsum.size()) {
				continue;
			}
			ans = Math.max(ans, (long)(bsum.get(x)+rsum.get(K-x)+x*x));
		}
		System.out.println(ans);
	}
}