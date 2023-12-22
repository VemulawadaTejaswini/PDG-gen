import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arrA = new int[n + 1];
    	for (int i = 0; i < n; i++) {
    	    arrA[i] = sc.nextInt();
    	}
    	arrA[n] = Integer.MAX_VALUE;
    	int[] arrB = new int[n + 1];
    	for (int i = 0; i < n; i++) {
    	    arrB[i] = sc.nextInt();
    	}
    	arrB[n] = Integer.MAX_VALUE;
    	int idxA = -1;
    	int idxB = -1;
    	int max = Integer.MIN_VALUE;
    	for (int i = 1; i <= n; i++) {
    	    while (arrA[idxA + 1] <= i) {
    	        idxA++;
    	    }
    	    while (arrB[idxB + 1] < i) {
    	        idxB++;
    	    }
    	    max = Math.max(max, idxA - idxB);
    	}
    	int[] ans = new int[n];
    	for (int i = 0; i < n; i++) {
    	    ans[i] = arrB[(i + max + n) % n];
    	    if (ans[i] == arrA[i]) {
    	        System.out.println("No");
    	        return;
    	    }
    	}
    	StringBuilder sb = new StringBuilder();
    	sb.append("Yes\n");
    	for (int i = 0; i < n; i++) {
    	    if (i > 0) {
    	        sb.append(" ");
    	    }
    	    sb.append(ans[i]);
    	}
    	System.out.println(sb);
	}
}