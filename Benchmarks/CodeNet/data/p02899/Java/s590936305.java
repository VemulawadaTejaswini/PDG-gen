import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>(N);
		for(int i = 0; i < N; i++) {
			int n = sc.nextInt();
			A.add(n);
			B.add(n);
		}
		int k = 0;
		for(int i = 0; i + k < N;) {
			for(int j = i; j < N; j++) {
				if(A.get(j) == i + 1) {
					B.set(i, j + 1);
					i++;
				}else if(A.get(j) == N - k) {
					B.set(N - k - 1, j + 1);
					k++;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.print(B.get(i) + " ");
		}
		sc.close();
	}
}