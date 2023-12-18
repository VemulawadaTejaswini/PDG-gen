import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Comparator<Work> comparator = new Comparator<Work>() {
		    @Override
		    public int compare(Work o1, Work o2) {
		        return Integer.compare(o2.B, o1.B);
		    }
		};
		PriorityQueue<Work> queue = new PriorityQueue<Work>(comparator);
		for (int i=0;i<N;i++) {
			int A = Integer.parseInt(sc.next());
			int B = Integer.parseInt(sc.next());
			queue.add(new Work(A, B));
		}

		int ans = 0;
		int[] flag = new int[M];
		while(!queue.isEmpty()) {
			Work rem = queue.remove();
			for (int i=M-rem.A;i>=0;i--) {
				if (flag[i]==1) {
					continue;
				} else {
					flag[i]=1;
					ans+=rem.B;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}

class Work {
	public int A;
	public int B;

	Work(int A, int B) {
		this.A = A;
		this.B = B;
	}
}