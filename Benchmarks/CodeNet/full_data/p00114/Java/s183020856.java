import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int [] a = new int[3];
			int [] m = new int[3];
			int end = 0;
			for(int i = 0; i < 3; i++){
				a[i] = sc.nextInt();
				m[i] = sc.nextInt();
				end = end | a[i] | m[i];
			}
			if(end == 0) break;
			long [] res = new long[3];
			for(int i = 0; i < 3; i++){
				res[i] = solve(a[i], m[i]);
			}
			long ans = lcm(res[0], lcm(res[1], res[2]));
			System.out.println(ans);
		}
	}

	private long solve(int a, int m) {
		long now = 1;
		for(int times = 1; times <= m + 1; times++){
			now = (now * a) % m;
			if(now == 1){
				return times;
			}
		}
		return -1;
	}
	
	private long gcd(long a, long b){
		if(b == 0)  return a;
		else        return gcd(b, a%b);
	}
	
	private long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}