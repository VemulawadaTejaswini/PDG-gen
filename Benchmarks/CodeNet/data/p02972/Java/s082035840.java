import java.util.*;
import java.util.stream.*;
 
public class Main {
	Scanner sc;
	int N;
	int M;
	
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
		input();
		calc();
		output();
	}
	
	private void input() {
		// データ入力
		N = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	private void calc() {
		// 答えを入れていくワーク用領域
		work = new int[N];
		
		for (int i = N; i > 0; i--) {
			int m = 0;
			for (int j = i; j <= N; j += i) {
				m ^= work[j-1];
			}
			work[i-1] = m;
		}
		
		// work が答えとなる。
		M = (int)IntStream.of(work).filter(n -> n > 0).count();
	}
	
	private void output() {
		
		// 答え出力
		out(M);
		if (M > 0) {
			String result = IntStream.range(0, N)
								.filter(n -> work[n] != 0)
								.mapToObj(n -> String.valueOf(n+1))
								.collect(Collectors.joining(" "));
			out(result);
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
