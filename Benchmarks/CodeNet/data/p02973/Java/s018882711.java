import java.util.*;
import java.util.stream.*;
 
public class Main {
	Scanner sc;
	int N;
	List<Integer> a;
	int color;
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	private void input() {
		N = sc.nextInt();
		a = new ArrayList<>();
		IntStream.range(0, N).forEach(i -> a.add(sc.nextInt()));
	}
	
	private void output() {
		out(color);
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	/**
	 * 計算本体
	 */
	private void calc() {
		// 右から順に部分列を取っていく
		color = 0;
		int index = N-1;
		while (true) {
//			printa();
			int v = a.get(index);
//			out("v="+v+",index="+index);
			color++;
			a.remove(index);
			for (int j = index-1; j >= 0; j--) {
				if (a.get(j) >= v) continue;
				v = a.get(j);
				a.remove(j);
				index--;
			}
			if (--index < 0) break;
		}
	}
	
	private void printa() {
		out(a.stream().map(n -> n.toString()).collect(Collectors.joining(" ")));
	}
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.input();
		m.calc();
		m.output();
	}
}
