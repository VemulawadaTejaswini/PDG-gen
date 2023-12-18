
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] as = new long[N];
		
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				as[i] = sc.nextLong();
			}
		}	
		List<Long> reslist = new ArrayList<Long>();
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				long r;
				long a = as[i];
				long b = as[j];
				while(b > 0) {
					r = a%b;
					a = b;
					b = r;
				}
				if (!reslist.contains(a)) {
					reslist.add(a);
				}
			}
		}
		reslist.sort(new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return (int) (o2-o1);
			}
		});
		Long result = 1l;
		for (Long integer : reslist) {
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (as[i]%integer == 0) {
					count++;
				}
			}
			if (count == N || count == N-1) {
				if (integer > result) {
					result = integer;
					
				}
			}
		}
		System.out.println(result);
	}
	
}