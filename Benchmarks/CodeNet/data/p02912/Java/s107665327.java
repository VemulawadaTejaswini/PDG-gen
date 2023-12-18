import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		PriorityQueue<Long> PQ = new PriorityQueue<Long>(new MyComp());
		for(int i = 0;i < N;i++) {
			PQ.add(scn.nextLong());
		}

		for(int i = 0;i < M;i++) {
			long a = PQ.poll()/2;
			PQ.add(a);
		}
		long ans = 0;
		while(!PQ.isEmpty()) {
			ans += PQ.poll();
		}
		System.out.println(ans);
	}

}

class MyComp implements Comparator<Long>{

	@Override
	public int compare(Long o1, Long o2) {
		if(o1 > o2) {
			return -1;
		}
		if(o1 < o2) {
			return 1;
		}
		return 0;
	}

}
