import java.util.*;

// ARC 78-C
// http://arc078.contest.atcoder.jp/tasks/arc078_a

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			if (N % 2 == i % 2) {
				answer.add(in.nextInt());
			} else {
				answer.add(0, in.nextInt());
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%d ", answer.get(i));
		}
		System.out.println();
	}
	
}
