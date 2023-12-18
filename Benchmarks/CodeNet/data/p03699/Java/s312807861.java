import java.util.*;

// ABC 62-D
// http://abc062.contest.atcoder.jp/tasks/arc074_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] scores = new int[N];
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			scores[i] = in.nextInt();
			sum += scores[i];
		}
		
		Arrays.sort(scores);
		int index = 0;
		
		while (sum % 10 == 0 && index < N) {
			sum -= scores[index];
			index++;
		}
		
		System.out.println(sum);
	}
}