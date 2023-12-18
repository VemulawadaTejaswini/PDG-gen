/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
  private static void solve(int n, int k, int q, int[] a) {
    int[] points = new int[n];
	for (int index : a) {
	  points[index - 1] += 1;
	}
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < n; i++) {
	  sb.append(points[i] + k - q > 0 ? "Yes" : "No");
	  if (i < n - 1) sb.append("\n");
	}
	System.out.println(sb.toString());
  }
  public static void main (String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	String[] nums = sc.nextLine().split(" ");
	int n = Integer.parseInt(nums[0]);
	int k = Integer.parseInt(nums[1]);
	int q = Integer.parseInt(nums[2]);
	int[] a = new int[q];
	for (int i = 0; i < q; i++) {
	  a[i] = Integer.parseInt(sc.nextLine());
	}
	solve(n, k, q, a);
  }
}