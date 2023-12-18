import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	String S;
	int[] count;
	
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
		S = sc.next();
		count = new int[S.length()];
		for (int i = 0; i < S.length();) {
			int j;
			for (j = i; j < S.length(); j++) {
				if (S.charAt(j) == 'L') break;
			}
			for (int k = i; k < j; k++) {
				if ( (j-k)%2 == 0 ) count[j]++;
				else count[j-1]++;
			}
			i = j;
			if (i >= S.length()) break;
			for (j = i+1; j < S.length(); j++) {
				if (S.charAt(j) == 'R') break;
			}
			for (int k = i; k < j; k++) {
				if ( (k-i)%2 == 0 ) count[i]++;
				else count[i-1]++;
			}
			i = j;
		}
		out(IntStream.of(count)
					.mapToObj(c -> String.valueOf(c))
					.collect(Collectors.joining(" ")));
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