import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();
		long s1 = 0;
		long s2 = 0;
		for(int i = 0; i < N; i++) {
			s1 += A[i];
			s2 += B[i];
		}
		if(s2 > s1) {
			System.out.println("-1");
			System.exit(0);
		}

		List<Long> l1 = new ArrayList<Long>();
		List<Long> l2 = new ArrayList<Long>();
		Deque<Long> s = new ArrayDeque<Long>();
		for(int i = 0; i < N; i++) {
			long e = A[i] - B[i];
			if(e < 0) {
				l1.add(e);
				s.addLast(e);
			}else if(e > 0) {
				l2.add(e);
			}
		}
		Collections.sort(l2);
		int cnt = l1.size();
		if(cnt == 0) {
			System.out.println(0);
			System.exit(0);
		}
		long k = 0;
		//System.out.println(cnt);
		long re = 0;
		for(long g : l1) {
			re += g;
		}
		//System.out.println(re);
		for(int j = l2.size() - 1; j >= 0; j--) {
			k += l2.get(j);
			cnt++;
			//System.out.println(k);
			while(!s.isEmpty()) {
				long m = s.pop();
				//System.out.println(m);
				if(k + m < 0) {
					s.push(k + m);
					k = 0;
					break;
				}else {
					k += m;
				}
				if(s.isEmpty()) {
					System.out.println(cnt);
					System.exit(0);
				}
			}
		}
		System.out.println(cnt);


	}
	static class Data{
		long A, B;
		long C;
		public Data(long A, long B) {
			this.A = A;
			this.B = B;
		}
	}
}
