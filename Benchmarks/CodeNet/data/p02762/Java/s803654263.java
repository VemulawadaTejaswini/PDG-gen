import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int M= scan.nextInt();
			int K= scan.nextInt();
			int[]A = new int[M];
			int[]B = new int[M];
			UnionFind uni = new UnionFind(N);
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();

			for(int i = 0;i<M;i++) {
				A[i] = scan.nextInt();
				B[i] = scan.nextInt();
				if(map.containsKey(A[i]))map.put(A[i], map.get(A[i])-1);
				else map.put(A[i], -1);
				if(map.containsKey(B[i]))map.put(B[i], map.get(B[i])-1);
				else map.put(B[i], -1);
				uni.connect(A[i]-1, B[i]-1);

			}
			int[]C = new int[K];
			int[]D = new int[K];
			for(int i = 0;i<K;i++) {
				C[i] = scan.nextInt();
				D[i] = scan.nextInt();
				if(uni.root(D[i]-1)==uni.root(C[i]-1)) {
					if(map.containsKey(C[i]))map.put(C[i], map.get(C[i])-1);
					else map.put(C[i], -1);
				}
				if(uni.root(C[i]-1)==uni.root(D[i]-1)) {
					if(map.containsKey(D[i]))map.put(D[i], map.get(D[i])-1);
					else map.put(D[i], -1);
				}



			}

			for(int i = 0;i<N;i++) {
				//System.out.println(uni.size(i));
			}


			for(int i = 0;i<N;i++) {
				int s = uni.size(i);
				int mi = map.get(i+1);
				System.out.print(s-1+mi+" ");
			}








		}


	}

private static class UnionFind {
		int Parent[];

		UnionFind(int n) {// Initialize by -1
			Parent = new int[n];
			Arrays.fill(Parent, -1);
		}

		int root(int A) {// In which tree is A?
			if (Parent[A] < 0)
				return A;
			return Parent[A] = root(Parent[A]);
		}

		int size(int A) {// size of tree which is include A
			return -Parent[root(A)];
		}

		boolean connect(int A, int B) {// Connect A and B
			A = root(A);
			B = root(B);
			if (A == B)
				return false;
			if (size(A) < size(B)) {
				int C = 0;
				C = B;
				B = A;
				A = C;
			} // SWAP
			Parent[A] += Parent[B];
			Parent[B] = A;
			return true;
		}
	}

}
