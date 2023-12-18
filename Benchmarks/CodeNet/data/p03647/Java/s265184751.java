import java.util.*;

// ARC 79-C
// http://arc079.contest.atcoder.jp/tasks/arc079_a

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		ArrayList<Integer> from1 = new ArrayList<Integer>();
		ArrayList<Integer> toN = new ArrayList<Integer>();
		
		for (int i = 0; i < M; i++) {
			int s = in.nextInt();
			int g = in.nextInt();
			
			if (s == 1) {
				from1.add(g);
			} else if (g == N) {
				toN.add(s);
			}
		}
		
		String answer = "IMPOSSIBLE";
		
		for (int i = 0; i < from1.size(); i++) {
			int island = from1.get(i);
			if (toN.contains(island)) {
				answer = "POSSIBLE";
				break;
			}
		}
		
		System.out.println(answer);
	}
}
