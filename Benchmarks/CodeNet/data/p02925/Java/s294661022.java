import java.util.*;

public class Main {
	static class Node {
		int day=0;
		ArrayList<Node> in  = new ArrayList<>();
		ArrayList<Node> out = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] A = new int[N][N-1];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				A[i][j] = sc.nextInt()-1;
			}
		}
		System.out.println(-1);
    }
}
