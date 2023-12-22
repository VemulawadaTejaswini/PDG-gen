import java.util.Scanner;

public class Main {
	static Long num;
	static long mod = 1000000007;
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			
			
			long maxManhattanPlus = Integer.MIN_VALUE;
			long minManhattanMin = Integer.MAX_VALUE;
			
			long maxManhattanMinuitPlus = Integer.MIN_VALUE;
			long minManhattanMinuitMin = Integer.MAX_VALUE;
			
			for(int j=0;j<N;j++) {
				int x = Integer.parseInt(sc.next());
				int y = Integer.parseInt(sc.next());				

				maxManhattanPlus = Math.max(maxManhattanPlus, x+y);
				minManhattanMin = Math.min(minManhattanMin, x+y);
				maxManhattanMinuitPlus = Math.max(maxManhattanMinuitPlus, x-y);
				minManhattanMinuitMin = Math.min(minManhattanMinuitMin, x-y);
			}
			long ans = Math.max(maxManhattanPlus-minManhattanMin,maxManhattanMinuitPlus-minManhattanMinuitMin);
			System.out.println(ans);
		}
	}
}