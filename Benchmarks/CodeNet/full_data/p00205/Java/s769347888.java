
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			byte[] hand = new byte[5];
			hand[0] = sc.nextByte();
			if(hand[0] == 0) break;
			for(int i=1;i<5;i++) hand[i] = sc.nextByte();
			boolean rps[] = new boolean[3];
			for(int i=0;i<5;i++) rps[ hand[i] -1 ] = true;
			if( (rps[0]&rps[1]&rps[2]) || (rps[0]&!rps[1]&!rps[2]) || 
				 (!rps[0]&rps[1]&!rps[2]) || (!rps[0]&!rps[1]&rps[2]) ) {
				for(int i=0;i<5;i++) {
					System.out.println(3);
				}
			}
			else if( rps[0]&rps[1] ) {
				for(int i=0;i<5;i++)
					System.out.println( ( (hand[i]==1)? 1:2 ) );
			}
			else if( rps[1]&rps[2] ) {
				for(int i=0;i<5;i++)
					System.out.println( ( (hand[i]==2)? 1:2 ) );
				}
			else {
				for(int i=0;i<5;i++)
					System.out.println( ( (hand[i]==3)? 1:2 ) );
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}