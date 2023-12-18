import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
		
	void doIt() {
		int n = sc.nextInt();
		Res[] rs = new Res[n];
		for(int i = 0; i < n; i++) {
			rs[i] = new Res(sc.next(), sc.nextInt(), i + 1);
		}
		Arrays.sort(rs);
		for(int i = 0; i < n; i++) {
			System.out.println(rs[i].i);
		}
	}

	class Res implements Comparable<Res>{
		int p, i;
		String s;
		Res(String s, int p, int i){
			this.s = s; this. p = p; this.i = i;
		}
		@Override
		public int compareTo(Res arg0) {
			if(this.s.compareTo(arg0.s) > 0) {
				return 1;
			}
			else if(this.s.compareTo(arg0.s) < 0) {
				return -1;
			}
			else if(this.p < arg0.p){
				return 1;
			}
			else if(this.p > arg0.p){
				return -1;
			}
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
