import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
//		int[][] xy = new int[n][2];
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(cal(scan.nextLong(), scan.nextLong()) <= d) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static double cal(long x, long y) {
		return Math.sqrt(x*x + y*y);
	}

}