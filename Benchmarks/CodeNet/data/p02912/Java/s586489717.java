import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int [] cost = new int [N];

		for (int index=0; index<N; index++) {
			cost[index]=sc.nextInt();
		}
		int where = 2;
		for (int index=0; index<M; index++) {
			try {
				if (cost[N-1]<cost[N-where]) {
					int temp = cost[N-1];
					cost[N-1]=cost[N-where];
					cost[N-where]=temp;
					where++;
					if (where>N) {
						where=2;
					}
				}
			} catch (Exception e) {
				
			}
			cost[N-1]=cost[N-1]/2;
		}
		long total = 0;
		for (int index=0; index<N; index++) {
			total+=cost[index];
		}
		System.out.println(total);
	}
}