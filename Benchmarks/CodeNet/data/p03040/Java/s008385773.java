import java.util.*;

class Main {
	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            return Integer.valueOf(o2).compareTo(Integer.valueOf(o1));
	        }
    	};
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		long b = 0;
		long ans=0;
		int cnt=0;
		long left_sum=0;
		long right_sum=0;
		Queue<Integer> pq1 = new PriorityQueue<Integer>(comparator);
		Queue<Integer> pq2 = new PriorityQueue<Integer>();

		for (int i=0;i<Q;i++) {
			int x=sc.nextInt();
			if (x==1) {
				int a=sc.nextInt();
				int B=sc.nextInt();
				b+=B;
				if (cnt!=0) {
					ans+=Math.min(Math.abs(pq1.peek()-a),Math.abs((pq2.peek()-a)));
				}
				pq1.add(a);
				pq2.add(a);
				cnt++;
				ans+=B;
				left_sum+=a;
				right_sum+=a;
				if (pq1.peek()>pq2.peek()) {
					int tmp_1=pq1.peek();
					int tmp_2=pq2.peek();
					pq1.remove();
					pq2.remove();
					pq1.add(tmp_2);
					pq2.add(tmp_1);
					left_sum+=-tmp_1+tmp_2;
					right_sum+=tmp_1-tmp_2;
				}
			} else if (x==2) {
				System.out.print(pq1.peek()+" ");
				System.out.println(ans);
//				System.out.println(b+pq1.peek()*cnt-left_sum+right_sum-pq2.peek()*cnt+pq2.peek()-pq1.peek());
			}
		}
	}
}