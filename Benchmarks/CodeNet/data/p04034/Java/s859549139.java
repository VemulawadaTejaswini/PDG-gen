import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] x = new int[M];
		int[] y = new int[M];
		for(int i = 0; i < M; i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}

		int[] result = new int[N];
		for(int i : result) result[i] = 1;

		for(int i = 0; i < M; i++) {
			result[x[i]-1]--;
			result[y[i]-1]++;
		}

		int prob = 0;
		for(int i = 0; i < result.length; i++) {
			if(result[i] > 0) prob++;
		}

		System.out.println(prob);


	}

}
