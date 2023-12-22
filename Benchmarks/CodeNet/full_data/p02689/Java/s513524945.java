
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] tenboudai = new int[N];
		for (int i = 0; i < N; i++) {
			tenboudai[i] = sc.nextInt();
		}
		HashSet<Integer>daturaku=new HashSet<Integer>();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			daturaku.add(Math.min(a, b));
		}
		System.out.print(tenboudai.length-daturaku.size());

	}
}
