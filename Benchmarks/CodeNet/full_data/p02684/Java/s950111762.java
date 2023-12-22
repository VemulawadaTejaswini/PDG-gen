import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		long K;
		N = sc.nextInt();
		K = sc.nextLong();

		long[] A = new long[N + 1];
		A[0] = 1;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		long ct = A[0];
		List<Long> list = new ArrayList<Long>();
		long x = 0;
		list.add(A[0]);
		for (int i = 0;i < N + 1; i++) {
			ct = A[(int) (ct)];
			if (list.contains(ct) == false) {
				list.add(ct);
			} else break;
		}

		/*for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
		}*/
		
		long loop_idx = list.indexOf(ct);
		
		long loopsize = list.size() - loop_idx;
		long r = (K+1 - loop_idx) % loopsize;
	//	System.out.println(loop_idx+" "+loopsize+" "+r+" "+list.size());
		if (r == 0) {
			System.out.println(list.get(list.size()-1));
		} else {
			System.out.println(list.get((int) (loop_idx + r -1)));
		}
		/*for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j)+" "+r);
		}*/
		
	}
}
