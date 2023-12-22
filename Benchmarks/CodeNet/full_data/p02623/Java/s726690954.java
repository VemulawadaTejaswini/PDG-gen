import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long M = Long.parseLong(sc.next());
		long K = Long.parseLong(sc.next());
		List<Long> listA = new ArrayList();
		List<Long> listB = new ArrayList();

		for(int i=0;i<N;i++) {
			listA.add(Long.parseLong(sc.next()));
		}
		for(int i=0;i<M;i++) {
			listB.add(Long.parseLong(sc.next()));
		}
		long count = 0;
		int a1 =0;
		int b1 =0;
		long a = listA.get(a1);
		long b = listB.get(b1);
		while(true) {
			if(a > K && b > K) break;
			if(a == Long.MAX_VALUE && b==Long.MAX_VALUE) {
				break;
			}
			if(a<b) {
				K -= a;
				a1++;
				if(a1 == listA.size()) {
					a = Long.MAX_VALUE;
				} else {
					a = listA.get(a1);
				}
			} else {
				K -= b;
				b1++;
				if(b1 == listB.size()) {
					b = Long.MAX_VALUE;
				} else {
					b = listB.get(b1);
				}
			}

			count++;
		}
		System.out.println(count);
	}
}