import java.util.*;

public class Main {

	static HashMap<Integer, ArrayList<Integer>> map;
	static boolean[] reached;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] L = new int[N];
		int[] R = new int[N];
		for(int i=0; i<M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}

		int count = 0;
		for(int i=1; i<=N; i++) {
			boolean flag = true;
			for(int j=0; j<M; j++) {
				if(!(L[j] <= i && R[j] >= i)) {
					flag = false;
				}
			}
			if(flag) count++;
		}

		println(count);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}