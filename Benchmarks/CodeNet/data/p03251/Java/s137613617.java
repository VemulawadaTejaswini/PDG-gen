import java.util.Arrays;
import java.util.Scanner;

// B

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());

		int[] Xn = new int[N];
		int[] Ym = new int[M];

		for(int i = 0; i < N; i++){
			Xn[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i < M; i++){
			Ym[i] = Integer.parseInt(sc.next());
		}

		// 昇順にソート
		Arrays.sort(Xn);
		Arrays.sort(Ym);

		int Z = Ym[0];

		if((X < Z && Z <= Y) && (Xn[N-1] < Z)){
			System.out.println("No War");
		}else{
			System.out.println("War");
		}
	}
}