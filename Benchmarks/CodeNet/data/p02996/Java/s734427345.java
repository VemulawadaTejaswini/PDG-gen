/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
	private static void solve(int n, long[][] tasks) {
	  Arrays.sort(tasks, (long[] v1, long[] v2) -> Long.compare(v1[1], v2[1]));
	  long taskSum = 0L;
	  for (int i = 0; i < n; i++) {
	  	long a = tasks[i][0];
	  	long b = tasks[i][1];
	  	taskSum += a;
	  	if (taskSum > b) {
	  	  System.out.println("No");
	  	  return;
	  	}
	  }
	  System.out.println("Yes");
	}
	public static void main (String[] args) throws java.lang.Exception {
	  Scanner sc = new Scanner(System.in);
	  int n = Integer.parseInt(sc.nextLine());
	  long[][] tasks = new long[n][2];
	  for (int i = 0; i < n; i++) {
	  	String[] nums = sc.nextLine().split(" ");
	  	tasks[i][0] = Long.parseLong(nums[0]);
	  	tasks[i][1] = Long.parseLong(nums[1]);
	  }
	  sc.close();
	  solve(n, tasks);
	}
}