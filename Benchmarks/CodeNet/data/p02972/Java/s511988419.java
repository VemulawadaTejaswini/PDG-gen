import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N;
	
	// a, work の添え字は１つずれたものを使う。
	// i.e. a[0] = a1, work[0] = w1 など。
	int[] a;
	int[] work;
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		// データ入力
		N = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		// 答えを入れていく
		work = new int[N];
		
		for (int i = N; i > 0; i--) {
			// i の約数の番号を work に xor していく
			update(i);
		}
		
		// work が答えとなる。
		int M = (int)IntStream.of(work).filter(n -> n > 0).count();
		
		// 答え出力
		out(M);
		if (M > 0) {
			String result = IntStream.range(0, N)
								.filter(n -> work[n] != 0)
								.mapToObj(n -> String.valueOf(n+1))
								.collect(Collectors.joining(" "));
			out(result);
		}
		
//		String result2 = IntStream.of(work)
//							.mapToObj(n -> String.valueOf(n))
//							.collect(Collectors.joining(" "));
//		out(result2);
	}
	
	private void update(int i) {
		if (a[i-1] == 0) return;
		work[i-1] ^= a[i-1]; // 自分自身は約数
		
		if (i%2 == 0) // 2 の倍数
			work[(i/2-1)] ^= a[i-1];
		if (i%3 == 0) // 3 の倍数
			work[(i/3-1)] ^= a[i-1];
		
		for (int d = 1; d <= i/4; d++) {
			if ( i%d != 0 ) continue;
			// d は i の約数
			work[d-1] ^= a[i-1];
		}
	}
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
}