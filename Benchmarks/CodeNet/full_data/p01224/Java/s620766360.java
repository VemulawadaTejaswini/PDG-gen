
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			int val = Divsum(n);
			if( n == val ) 		System.out.println("perfect number");
			else if( n > val )	System.out.println("deficient number");
			else 				System.out.println("abundant number");
		}
	}
	
	int Divsum(int x) {
		if( x == 1 ) return 0;
		int sum = 1;
		for(int i=2;i*i<=x;i++) if(x%i == 0){
			sum += i;
			if( x/i != i ) sum += x/i;
		}
		return sum;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}