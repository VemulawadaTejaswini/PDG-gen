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
		
		int cnt = 0;
		
		ArrayList<Integer> visited = new ArrayList<Integer>();
		int now = 0;
		while(!visited.contains(now) && cnt < K) {
			visited.add(now);
			now = A.get(now);
			cnt ++;
		}
		
		int cycleFirst = now;
		now = A.get(now);
		int cycleCnt = 1;
		cnt ++;
		while(now != cycleFirst && cnt < K) {
			now = A.get(now);
			cycleCnt ++;
			cnt ++;
		}
		
		long left = K - cnt;
		for(int i = 0; i < left % cycleCnt; i ++) {
			now = A.get(now);
		}
		System.out.println(now + 1);
	}
}