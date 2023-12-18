import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] rank = new int[n];
			int[] point = new int[n];
			for(int i = 0 ; i < n ; i++) {
				rank[i] =  sc.nextInt();
				point[i] =  sc.nextInt();
			}
			Arrays.sort(rank);
			Arrays.sort(point);
			int top = rank[0] - 1;
			int bottom = point[0];
			int middlePoint = point[point.length - 1] - point[0] + 1;
			int middleRank = rank[rank.length - 1] - rank[0] + 1;
			int middle = Math.min(middlePoint, middleRank);
			System.out.println(top + bottom + middle);
		}

	}

}
