import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N;
	int[] H;
	
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
		H = new int[N];
		
		int lastVal = -1;
		boolean solvable = true;
		
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			if (H[i] - 1 >= lastVal) {
				lastVal = H[i] - 1;
				continue;
			} else if (H[i] >= lastVal) {
				lastVal = H[i];
				continue;
			}
			solvable = false;
			break;
		}
		out(solvable?"Yes":"No");
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