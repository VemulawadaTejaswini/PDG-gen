import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static ArrayList<Integer> UnionFind = new ArrayList<Integer>();
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		// initialize
		for(int i = 0; i < N; i ++) {
			UnionFind.add(-1);
		}
		for(int i = 0; i < M; i ++) {
			unit(stdIn.nextInt() - 1, stdIn.nextInt() - 1);
		}
		int ans = 0;
		for(int i = 0; i < N; i ++) {
			ans = Math.max(ans, UnionFind.get(i) * -1);
		}
		System.out.println(ans);
	}
	
	private static int getRoot(int x) {
		if(UnionFind.get(x) < 0) {
			return x;
		}else {
			return getRoot(UnionFind.get(x));	
		}
	}
	
	private static void unit(int A, int B) {
		int rootA = getRoot(A);
		int rootB = getRoot(B);
		if(rootA != rootB) {
			UnionFind.set(rootA, UnionFind.get(rootA) + UnionFind.get(rootB));
			UnionFind.set(rootB, rootA);
		}
	}
}