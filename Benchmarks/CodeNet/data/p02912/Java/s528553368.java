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
		for (int index=0; index<M; index++) {
			int place = getMax(cost,N);
			cost[place]=cost[place]/2;
		}
		long total = 0;
		for (int index=0; index<N; index++) {
			total+=cost[index];
		}
		System.out.println(total);
	}

	static int getMax(int[] cost, int N) {
		int max = 0;
		int maxPlace = 0;
		for (int index=0; index<N; index++) {
			if (max<cost[index]) {
				max=cost[index];
				maxPlace=index;
			}
		}

		return maxPlace;
	}
}
