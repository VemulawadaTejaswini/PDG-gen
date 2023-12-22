import java.util.*;

public class Main {
	//Implementation #1
	public static int compute_maxprofit(int n, int[] R) {
		int max = R[1] - R[0];
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(R[j] - R[i] > max)
					max = R[j] - R[i];
			}
		}
		return max;
	}
	
	//Implementation #2
	public static int compute_maxprofit2(int n, int[] R) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, R[i]- min);
			
			min = Math.min(R[i], min);
		}
		return max;
	}
	
	
	public static void main(String args[]) {
		Scanner k = new Scanner(System.in);
		int n = k.nextInt();
		int[] array = new int[n];
		for(int x = 0; x < n; x++) {
			array[x] = k.nextInt();
		}
		//System.out.println(compute_maxprofit(n, array));
		System.out.println(compute_maxprofit2(n, array));
	}

}

