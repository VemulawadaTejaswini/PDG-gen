import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[M];
		int[] b = new int[M];

		List<Integer> list_a = new ArrayList<Integer>();
		List<Integer> list_b = new ArrayList<Integer>();

		boolean can = false;

		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for(int i = 0; i < M; i++) {
			if(a[i] == 1) {
				list_b.add(b[i]);
			}
			if(b[i] == N) {
				list_a.add(a[i]);
			}
		}

		if(list_a.removeAll(list_b)) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}



	}
}
