import java.util.*;

class Main{
	static long mod = 1000000007;
	static ArrayDeque<pair> st = new ArrayDeque<>();

	public static void insert(line l1) {
		if (st.isEmpty()) {
			st.add(new pair(l1, 0L));

		} else {
			while (st.size() > 0) {
				line tl = st.peekLast().l;
				long pt = st.peekLast().xo;
				long newpt = intersectionpt(tl, l1);
				if (newpt <= pt) {
					st.pollLast();
				} else {
					break;
				}
			}
			st.add(new pair(l1, intersectionpt(l1, st.peekLast().l)));
		}

	}

	public static long query(long x) {
		while(st.size() > 1) {
			pair p1=st.pollFirst();
			pair p2=st.pollFirst();
			if(p2.xo<=x){
				st.addFirst(p2);
			}else{
				st.addFirst(p2);
				st.addFirst(p1);
				break;
			}
		}
		return value(st.peekFirst().l, x);

	}

	public static long value(line l1, long x) {
		return l1.slope * x + l1.intcep;
	}

	public static class pair {
		line l;
		long xo;

		pair(line l1, long b) {
			l = l1;
			xo = b;
		}
	}

	public static class line {
		long slope;
		long intcep;

		line(long a, long b) {
			slope = a;
			intcep = b;
		}
	}

	public static long intersectionpt(line l1, line l2) {
		return (long) Math.ceil(1.0 * (l2.intcep - l1.intcep) / (l1.slope - l2.slope));
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long c = scn.nextLong();
		long h[] = new long[n];
		for (int i = 0; i < n; i++) {
			h[i] = scn.nextLong();
		}
		long dp[]=new long[n];
		dp[0]=0L;
	     insert(new line(-2*h[0],h[0]*h[0]));
	     for(int i=1;i<n;i++){
	    	 dp[i]=h[i]*h[i]+c+query(h[i]);
	    	 insert(new line(-2*h[i],h[i]*h[i]+dp[i]));
	     }
	     System.out.println(dp[n-1]);

	}

}