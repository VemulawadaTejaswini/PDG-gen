
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] cards = new int[13];
	boolean c3, c4;
	boolean p1, p2;
	boolean st;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			c3 = p1 = p2 = st = c4 = false;
			int[] cards = new int[13];
			String[] str = sc.next().split(",");
			for(int i=0;i<5;i++) {
				cards[ Integer.parseInt(str[i])-1 ]++;
			}
			int cnt = 0;
			for(int i=0;i<13;i++) {
				if( cards[i] == 4 ) {
					c4 = true;
				}
				if( cards[i] == 3 ) {
					c3 = true;
				}
				if( p1 && cards[i] == 2 ) {
					p2 = true;
				}
				if( cards[i] == 2 ) {
					p1 = true;
				}
				if(cards[i] > 0 && cards[i] == cards[(i+1)%13]) cnt++;
				if(cnt != 4 && cnt > 0 && cards[i] != cards[(i+1)%13]) cnt = 0;
//				System.out.println(cnt);
			}
			if( c4 ) {
				System.out.println("four card");
			}
			else if(p1 && c3) {
				System.out.println("full house");
			}
			else if(cnt==4) {
				System.out.println("straight");
			}
			else if(c3) {
				System.out.println("three card");
			}
			else if(p2) {
				System.out.println("two pair");
			}
			else if(p1) {
				System.out.println("one pair");
			}
			else {
				System.out.println("null");
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