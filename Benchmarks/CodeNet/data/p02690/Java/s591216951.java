import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		int X = sc.nextInt();
		List<Integer> f = new ArrayList<>();
		for(int i = 1; i * i <= X; i++) {
			if(X % i == 0) {
				f.add(i);
			}
			f.add(X);
		}
		for(int d : f) {
			for(int a = 0; a * a <= X; a++) {
				int b = d - a;
				if(Math.pow(a, 5) - Math.pow(b, 5) == X) {
					System.out.println(a + " " + b);
					return;
				}
			}
		}
		//System.out.println(Arrays.toString(f.toArray()));
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
