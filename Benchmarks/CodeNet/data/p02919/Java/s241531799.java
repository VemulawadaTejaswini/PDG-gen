import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] P = new int[N];
		int[] A = new int[N+1];
		for(int i = 0;i < N;++i) {
			P[i] = Integer.parseInt(sc.next());
			A[P[i]] = i+1;
		}
		sc.close();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(0);
		set.add(N+1);
		set.add(A[N]);
		long sum = 0;
		for(int i = N-1;i >=1;--i) {
			int Xi = A[i];
			long y = set.higher(Xi);
			long z = y < N+1 ? set.higher((int)y) : N+1;
			long x = set.lower(Xi);
			long w = x != 0 ? set.lower((int)x) : 0;
			long C = (x - w)*(y - Xi)+(Xi - x)*(z - y);
			sum += C * i;
			set.add(Xi);
		}
		System.out.println(sum);
	}
}