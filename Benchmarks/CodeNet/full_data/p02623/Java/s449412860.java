import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long M = Long.parseLong(sc.next());
		long K = Long.parseLong(sc.next());
		List<Long> A = new ArrayList();
		List<Long> B = new ArrayList();

		for(int i=0;i<N;i++) {
			A.add(Long.parseLong(sc.next()));
		}
		for(int i=0;i<M;i++) {
			B.add(Long.parseLong(sc.next()));
		}

		long count = 0;
		while(true) {
			long a = Long.MAX_VALUE;
			long b = Long.MAX_VALUE;
			if(A.size() >0)a = A.get(0);
			if(B.size() >0)b = B.get(0);

			if(K < a && K < b)break;
			if(a<=b) {
				K -= a;
				A.remove(0);
			} else {
				K -= b;
				B.remove(0);
			}
			count++;
		}
		System.out.println(count);
	}
}