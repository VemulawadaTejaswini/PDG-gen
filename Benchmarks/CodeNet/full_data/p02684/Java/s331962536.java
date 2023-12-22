import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		long K = stdIn.nextLong();
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i ++) {
			A.add(stdIn.nextInt() - 1);
		}
		
		ArrayList<Integer> visited = new ArrayList<Integer>();
		ArrayList<Long> when = new ArrayList<Long>();
		for(int i = 0; i < N; i ++) {
			when.add((long) -1);
		}
		int now = 0;
		int cnt = 0;
		
		for(long k = K; 0 < k; k --) {
			visited.add(now);
			now = A.get(now);
			if(visited.contains(now)) {
				int cycleCnt = (int) (when.get(now) - k);
				k = k % cycleCnt;
			}
			when.set(now, k);
		}
		
		System.out.println(now + 1);
	}
}