/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Main {
    static long getCycle(int[] perm, int[] costs, int moves, int idx) {
        int prev = idx;
        long max = Long.MIN_VALUE;
        long curr = 0;
        for(int i = 0; i<moves; i++) {
            int newIn = perm[prev];
            curr+=costs[newIn];
            max = Math.max(max, curr);
            prev = newIn;
        }
        return max;
    }
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i<n; i++) p[i] = sc.nextInt()-1;
		int[] costs = new int[n];
		for(int i = 0; i<n; i++) costs[i] = sc.nextInt();
		long max = Long.MIN_VALUE;
		for(int i = 0; i<n; i++) {
		    max = Math.max(max, getCycle(p, costs, k, i));
		}
		System.out.println(max);
	}
}