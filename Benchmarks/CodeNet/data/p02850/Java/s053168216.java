import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] cnts = new int[N+1];
		int[] edges = new int[N+1];
		int[][] edge = new int[N][2];
		Arrays.fill(edges, 1);
		int max = 0;
		for (int i = 1; i < N; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			edge[i][0] = A;
			edge[i][1] = B;
			cnts[A]++;
			cnts[B]++;
			max = Math.max(cnts[A], max);
			max = Math.max(cnts[B], max);
		}
		System.out.println(max);
		for (int i = 1; i < N; i++) {
			int A = edge[i][0];
			int B = edge[i][1];
			System.out.println(Math.max(edges[A], edges[B]));
			edges[A]++;
			edges[B]++;
		}
	}
}