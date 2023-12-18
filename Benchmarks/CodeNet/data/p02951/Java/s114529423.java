import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int A,B,C;
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
		int remain = A-B;
		out(Math.max(0, C - remain));
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	private void input() {
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
	}
	
//======
// main
//
	public static void main(String[] args) {
		Main m = new Main();
		m.input();
		m.calc();
	}

}