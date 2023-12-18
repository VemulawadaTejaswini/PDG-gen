import java.util.*;
// Just thought will hit 100 and then stop
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
		int t1 = X*A+Y*B, t2=(2*C*((C<A && C<B) ? Math.max(X,Y) : Math.min(X,Y)))+
		((C<A && C<B) ? 0 : ((X>Y) ? (X-Y)*A : (Y-X)*B));
		System.out.println(Math.min(t1, t2));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}