import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		ArrayList<Integer> ansList = list;
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i = 0; i < M; i++) {
			A[i] = Integer.parseInt(sc.next());
			B[i] = Integer.parseInt(sc.next());

			int left = list.get(A[i] - 1);
			int right = list.get(B[i] - 1);
			if(left < right) {
				if(ansList.contains(left)) {
					ansList.remove(ansList.indexOf(left));
				}
			}else if(left > right) {
				if(ansList.contains(right)) {
					ansList.remove(ansList.indexOf(right));
				}
			}else {
				if(ansList.contains(left)) {
					ansList.remove(ansList.indexOf(left));
				}
				if(ansList.contains(right)) {
					ansList.remove(ansList.indexOf(right));
				}
			}
		}
		sc.close();
		System.out.println(ansList.size());
	}

}