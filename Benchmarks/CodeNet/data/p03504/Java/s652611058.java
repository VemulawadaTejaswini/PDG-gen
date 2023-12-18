import java.util.*;
import java.io.*;



public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();

		int[] pre = new int[100002];

		for(int i = 0;i < n; ++i) {
			int s = in.nextInt();
			int t = in.nextInt();
			int C = in.nextInt();
			pre[s]++;
			pre[t+1]--;
		}

		int max = 0;
		for(int i = 1; i < pre.length; ++i) {
			pre[i] = pre[i] + pre[i - 1];
			max = Math.max(pre[i], max);
		}

		System.out.println(max);
	}


}