
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int qual[];
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if( (a|b|c) == 0 ) break;
			int n = sc.nextInt();
			qual = new int[a+b+c];
			Test[] tests = new Test[n];
			fill(qual, 2);
			for(int i=0;i<n;i++) {
				tests[i] = new Test(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			sort(tests);
			for(int i=0;i<n;i++) {
				if( tests[i].t == 1 ) {
					for(int j=0;j<3;j++)
						qual[tests[i].ps[j]-1] = 1;
				}
				else {
					for(int j=0;j<3;j++) {
						if( qual[tests[i].ps[j]-1] == 1 && qual[tests[i].ps[(j+1)%3]-1] == 1 )
							qual[tests[i].ps[(j+2)%3]-1] = 0;
					}
						
				}
			}
			
			for(int i=0;i<a+b+c;i++) {
				System.out.println(qual[i]);
			}
			
		}
	}
	
	class Test implements Comparable<Test>{
		int t;
		int[] ps;
		Test(int a, int b, int c, int t) {
			ps = new int[3];
			ps[0] = a;
			ps[1] = b;
			ps[2] = c;
			this.t = t;
		}
		@Override
		public int compareTo(Test o) {
			// TODO 自動生成されたメソッド・スタブ
			return o.t - t;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}