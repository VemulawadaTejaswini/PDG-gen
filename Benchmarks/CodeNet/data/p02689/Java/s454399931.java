import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> max = new HashSet<Integer>();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		int[][] link = new int[m][2];


		for(int i = 0; i <n; i++) {
			h[i] = sc.nextInt();
		}

		for(int i = 0; i <m ;i++) {
			link[i][0] = sc.nextInt();
			link[i][1] = sc.nextInt();
			if(max.contains(Math.min(link[i][0], link[i][1]))) {
				max.remove(Math.min(link[i][0],link[i][1] ));
			}
			max.add( (int) (Math.max(h[link[i][0]-1], h[link[i][1]-1])));
		}

		System.out.println(max.size());



	}

}