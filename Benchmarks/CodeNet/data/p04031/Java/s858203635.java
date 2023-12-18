import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int a[] = new int[N];
		int max = 0;
		int min = 0;
		for (int i = 0; i < N; i++) {
			switch (i) {
			case 0:
				a[i] = scan.nextInt();
				min = a[i];
				max = a[i];
				break;
			default:
				a[i] = scan.nextInt();
				if (max < a[i]) {
					max = a[i];
				} else if (min > a[i]) {
					min = a[i];
				}
				break;
			}
		}
		int minCost = 40000;
		for (int i = min; i <= max; i++) {
			int cost = 0;
			for (int j = 0; j < N; j++) {
				int dis = a[j] - i;
				cost += dis * dis;
			}
			if (minCost > cost) {
				minCost = cost;
			}
		}
		System.out.println(minCost);
	}

}
