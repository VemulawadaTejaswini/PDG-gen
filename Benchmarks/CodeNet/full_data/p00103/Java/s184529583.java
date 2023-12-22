import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run() {
		int n = sc.nextInt();
		int out = 0;
		boolean[] base = new boolean [4];
		base[0] = true;
		int count = 0;
		int ining = 0;
		while (true) {
			if( ining == n ) break;
			String str = sc.next();
			if(str.equals("HIT")) {
				if(base[3]) count ++;
				for(int i=3;i>0;i--) base[i] = base[i-1];
			}
			else if( str.equals("HOMERUN") ) {
				for(int i=0;i<4;i++) {
					if (base[i]) count++;
					base[i] = false;
				}
				base[0] = true;
			}
			else {
				out++;
				if( out == 3 ) {
					ining++;
					System.out.println(count);
					count=0;
					out=0;
					
					base = new boolean[4];
					base[0] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}