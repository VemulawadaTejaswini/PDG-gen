
import java.util.Scanner;

public class Main {
	static int[] parents;
	static int[] weights;
	static void set(int x) {
		parents[x] = x;
		weights[x] = 1; // initialize weights
	}
	static int find(int x) { // with path compression
		int curr = x;
		while (parents[curr] != curr) curr = parents[curr];
		return curr;
	}
	static void union(int x, int y) {
		int r1 = find(x);
		int r2 = find(y);
		if (r1 != r2) {
			if (weights[r1] > weights[r2]) {
				parents[r2] = r1;
				weights[r1] += weights[r2];
			} else {
				parents[r1] = r2;
				weights[r2] += weights[r1];
			}
			
		}
	}
	
	static boolean areConnected(int x, int y) {
		int r1 = find(x);
		int r2 = find(y);
		return (r1 == r2);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int users = in.nextInt();
		parents = new int[users];
		weights = new int[users];
		int relations = in.nextInt();
		for (int i = 0; i < users; i++) {
			set(i);
		}
		for (int i = 0; i < relations; i++) {
			union(in.nextInt(), in.nextInt());
		}
		int checks = in.nextInt();
		for (int i = 0; i < checks; i++) {
			if (areConnected(in.nextInt(),in.nextInt())) {
				System.out.println("yes");
			} else System.out.println("no");
		}
		in.close();
	}
}

