import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int[] cost = new int[sc.nextInt()];
			int m = sc.nextInt();

			for(int i = 0; i < cost.length; i++) {
				cost[i] = sc.nextInt();
			}
			int[] vote = new int[cost.length];
			for(int j = 0; j < m; j++) {
				int base = sc.nextInt();
				for(int i = 0; i < cost.length; i++) {
					if(cost[i] <= base) {
						vote[i]++;
						break;
					}
				}
			}
			int max = 0;
			int max_index = 0;
			for(int i = 0; i < vote.length; i++) {
				if(max < vote[i]) {
					max = vote[i];
					max_index = i;
				}
			}
			System.out.println(max_index + 1);
		}
	}
}
