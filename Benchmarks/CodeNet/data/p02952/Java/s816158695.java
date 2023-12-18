import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N;
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	/**
	 * アルゴリズム本体
	 */
	private void calc() {
		N = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i <= N; i++) {
			int digits = 1 + (int)Math.log10(i);
			if (digits % 2 == 1) count++;
		}
		out(count);
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
//======
// main
//
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}