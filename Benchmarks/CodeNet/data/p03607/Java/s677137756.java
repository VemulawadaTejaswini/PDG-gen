import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		ArrayList<Integer> paper = new ArrayList();
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());

		}

		for(int i = 0; i < A.length; i++) {
			if(paper.contains(A[i])) {
				paper.remove((Integer)A[i]);
			}else {
				paper.add(A[i]);
			}
		}

		System.out.println(paper.size());

		sc.close();
	}

}
