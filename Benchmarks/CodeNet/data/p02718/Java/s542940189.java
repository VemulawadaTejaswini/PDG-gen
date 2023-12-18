import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] itemVotes = new int[N];
		int sum = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			itemVotes[i] = in.nextInt();
			sum = sum + itemVotes[i];
		}
		
		float cutoff = (1/(4* (float) M))*(float) sum;
		Arrays.sort(itemVotes);
		
		for(int i = 0; i<N; i++) {
			if(itemVotes[i] >= cutoff) {
				count++;
			}
		}
		
		if(count >= M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
}
