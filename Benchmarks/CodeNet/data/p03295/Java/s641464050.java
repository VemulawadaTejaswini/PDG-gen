import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int []a = new int[M];
		int []b = new int[M];
		List<Integer> listA = new ArrayList<Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		for(int i = 0; i < M; i++) {
			int t1 = scan.nextInt();
			int t2 = scan.nextInt();
			a[i] = t1;
			b[i] = t2;
			listA.add(t1);
			listB.add(t2);
		}
		scan.close();

		int []t = new int[N + 2];

		for(int i = 0; i < M; i++) {
			t[a[i]]++;
			t[b[i] + 1]--;
		}
		for(int i = 1; i <= N; i++) {
			t[i] += t[i - 1];
		}


		int max = 0;
		for(int i = 1; i <= N; i++) {
			if(max < t[i]) {
				max = t[i];
			}
		}


		System.out.println(max / 2);

	}
}
