import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int d[] = new int[N];
		
		for(int i=0; i<N; i++) {
			d[i] = sc.nextInt();
		}
		//問題を難易度順に昇順で並び替える
		Arrays.sort(d);
		// N/2番目の要素から、N/2-1番目の要素を引いたものを出力
		System.out.println(d[N/2]-d[N/2-1]);
	}		
}
	// N/2番目に難しい問題がARC用の問題、N/2-1番目に難しい問題がABC用の問題
	// ARC用の問題の数とABC用の問題の数は同じになる
	// 以上の２つは同じ値である