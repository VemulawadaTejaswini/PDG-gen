import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		long K;
		N = sc.nextInt();
		K = sc.nextLong();

		long[] A = new long[N + 1];
		A[0] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		long ct = 1;
		List<Long> list = new ArrayList<Long>();
		long x = 0;
		list.add(ct);
		for (long i = 1; i < K + 1; i++) {
			ct = A[(int) (ct)];
			if (list.contains(ct) == false) {
				list.add(ct);
			} else {
				long ini = list.indexOf(ct) + 1;
				long s = i - ini + 1;
				long r = (K - ini + 1) % s;
				System.out.println(list.get((int) (ini + r - 1)));
				/*	if (r == 0) {
						for (int j = 0; j < list.size(); j++) {
							System.out.println(list.get(j) + " " + ini + " " + r);
						}
						System.out.println(list.get((int) ini-1));
					} else {
						
				
						System.out.println(list.get((int) (ini + r - 1)));
					}*/
				break;
			}
		}

	}
}
