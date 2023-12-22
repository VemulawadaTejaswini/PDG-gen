import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] R = new int[n];
	for(int i = 0; i < n; i++) {
	    R[i] = in.nextInt();
	}
	int[] min = new int[n];
	for(int i = 0; i < n; i++) {
	    min[i] = i == 0 ? R[i] : Math.min(min[i - 1], R[i]);
	}
	int max = Integer.MIN_VALUE;
	for(int i = 1; i < n; i++) {
	    max = Math.max(max, R[i] - min[i - 1]);
	}
	System.out.println(max);
    }
}

