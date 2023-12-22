import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		long[] heights = new long[N+1];
		long cnt = 0;
		for (int i = 1; i <= N; i++) {
			heights[i] = input.nextLong();
		}
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) {
			ArrayList<Integer> x = new ArrayList<Integer>();
			graph[i] = x;
		}
		for (int i = 0; i < M; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			graph[A].add(B);
			graph[B].add(A);
		}
		for (int i = 1; i <= N; i++) {
			long height = heights[i];
			boolean good = true;
			for (int j = 0; j < graph[i].size(); j++) {
				long altheight = heights[graph[i].get(j)];
				if (altheight>=height) {
					good = false;
					break;
				} 
			}
			if (good) cnt++;
		}
		System.out.println(cnt);
	}
}