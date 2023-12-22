import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int P,Q, R;
	String line;
	int pos;
	void run() {
		for(;;) {
			line = sc.nextLine();
			if( line.equals(".") ) break;
			int cnt = 0;
			for(P=0;P<3;P++) for(Q=0;Q<3;Q++) for(R=0;R<3;R++) {
				pos = 0;
				if(formula() == 2) cnt++;
			}
			System.out.println(cnt);
		}
		
	}
	
	int formula() {
		char c = line.charAt(pos);
		int value = val( c );
		if( value >= 0 ) { pos++; return value; }
		
		if( c == '-' ){
			pos++;
			return not(formula());
		}
		pos++;
		int a = formula();
		char cc = line.charAt(pos++);
		int b = formula();
		pos++;
		
		if( cc == '*' ) {
			return and(a, b);
		}
		
		return or(a, b);
	}
	
	int val(char c) {
		switch (c) {
		case ('0'): return 0;
		case ('1'): return 1;
		case ('2'): return 2;
		case ('P'): return P;
		case ('Q'): return Q;
		case ('R'): return R;
		default:    return -1;
		}
	}
		
	
	int not( int x ) {
		return 2-x;
	}
	
	int and (int x, int y) {
		return Math.min(x, y);
	}
	
	int or ( int x, int y ) {
		return Math.max(x, y);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}