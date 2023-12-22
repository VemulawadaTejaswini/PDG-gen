import java.util.*;


public class Main {
	public static int compute_max(int[] R) {
		int minprice = R[0];
	    int maxprofit = Integer.MIN_VALUE;
	    for (int i = 1; i < R.length; i++) {
	    	maxprofit = Math.max(maxprofit, R[i] - minprice);;
	    	minprice = Math.min(R[i],minprice);
	    	}
	    return maxprofit;
	    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] m = new int[n];
		for (int i = 0; i < n; i++) {
			m[i] = in.nextInt();
		}
		System.out.println(compute_max(m));
	}

}


