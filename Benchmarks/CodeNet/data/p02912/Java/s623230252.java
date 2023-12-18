import java.io.PrintStream;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final int M = sc.nextInt();

		final int[] A = new int[N];

		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}

		final PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.intValue() - o1.intValue();
			}
		});

		for(int i=0;i<N;i++) {
			queue.add(A[i]);
		}
		if(N==1) {
			for(int m=0;m<M;m++) {
				A[0] = A[0] / 2;
			}
			out.println(A[0]);
			return;
		}

		int m = M;
		int head = queue.remove();
		int next = queue.element();
		while(m > 0) {
			head = head / 2;
			m--;
			if(head < next) {
				queue.add(head);
				head = queue.remove();
				next = queue.element();
			}
		}
		long sum = head;
		for(int x=0;x<N-1;x++) {
			sum += queue.remove().intValue();
		}
		out.println(sum);
	}

}
