import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] one = new int[N];
		for(int i = 0; i < N; i++) {
			one[i] = sc.nextInt();
		}
		
		int[] result = new int[N];
		Arrays.fill(result, 0);
		
		for(int i = N; i > 0; i--) {
			int sum = 0;
			for(int j = 2; j * i <= N; j++) {
				sum += result[j * i - 1];
			}
			result[i - 1] = (sum % 2) ^ one[i - 1];
		}
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++) {
			if(result[i] == 1)queue.add(i + 1);
		}
		System.out.println(queue.size());
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+((queue.isEmpty()?"":" ")));
		}
		System.out.println();
	}
}