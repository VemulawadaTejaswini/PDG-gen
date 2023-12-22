import java.util.Scanner;

public class Main {
	
	public static int maxPDP(int[] values) {
		int maxp = values[1]-values[0];
		int minv = Math.min(values[1], values[0]);
		for(int i = 2; i < values.length; i ++) {
			maxp = Math.max(maxp, values[i] - minv);
			minv = Math.min(minv, values[i]);
		}
		return maxp;
	}
	
	public static int maxPQ(int[] values) {
		int maxp = Integer.MIN_VALUE;
		int n = values.length;
		for(int i = 0; i < n-1; i ++) {
			for(int j = i+1; j < n; j ++) {
				if (values[j]-values[i] > maxp) {
					maxp = values[j]-values[i];
				}
			}
		}
		return maxp;
	}

	public static void main(String[] args) {

		// Collect and store values
		Scanner in = new Scanner(System.in);
		int[] v = new int[in.nextInt()];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = in.nextInt();
		}
		
		// Call appropriate method
		System.out.println(maxPDP(v));
	}

}

