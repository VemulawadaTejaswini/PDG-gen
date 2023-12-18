import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		int[] D = new int[N];
		for(int k=0;k<N;k++) {
			A[k] = sc.nextInt();
			B[k] = sc.nextInt();
		}
		for(int k=0;k<N;k++) {
			C[k] = sc.nextInt();
			D[k] = sc.nextInt();
		}
		// 出力
		System.out.println(solve(A,B,C,D));
		sc.close();
	}
	
	public static String solve(int[] A, int[] B, int[] C, int[] D) {
		int N = A.length;
		List<List<Integer>> ok_blues = new ArrayList<>();
		PriorityQueue<List<Integer>> q = new PriorityQueue<>((a,b)-> b.size()-a.size());
		for(int k=0;k<N;k++) {
			List<Integer> okps = new ArrayList<>();
			for(int l=0;l<N;l++) {
				if(A[k] < C[l] && B[k] < D[l]) {
					okps.add(l);
				}
			}
			ok_blues.add(okps);
			q.add(okps);
		}
		//System.out.println(ok_blues);
		int ret = use_blue(q,new ArrayList<Integer>());
		return String.format("%d", ret);
	}
	private static int use_blue(PriorityQueue<List<Integer>> q, List<Integer> used) {
		if(q.isEmpty()) {
			return 0;
		}
		List<Integer> able = q.poll();
		while(able.size() == 0 && !q.isEmpty()) {
			able = q.poll();
		}
		if(able == null) {
			return 0;
		}
		//System.out.println("used:" + used);
		int max=0;
		for(Integer one_p:able) {
			//System.out.println("check:" + one_p);
			if(!used.contains(one_p)) {
				List<Integer> used_next = new ArrayList<Integer>(used);
				used_next.add(one_p);
				int cnt = use_blue(q, used_next) + 1;
				if(max < cnt) {
					max = cnt;
				}
			}
		}
		return max;
	}
}
