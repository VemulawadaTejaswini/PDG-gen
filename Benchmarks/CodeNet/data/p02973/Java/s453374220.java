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
		a = new LinkedList<>();
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
		while (a.size() > 0) {
			ListIterator<Integer> iter = a.listIterator(a.size());
			int v = iter.previous();
			color++;
			iter.remove();
			while (iter.hasPrevious()) {
				int p = iter.previous();
				if (p >= v) continue;
				v = p;
				iter.remove();
			}
		}
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
