import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		long res = k;
		for(int i = 1; i < n; i++){
			res *= k - 1;
			if(res > Math.pow(2, 31) - 1){
				System.out.println(Integer.MAX_VALUE);
				return;
			}
		}
		System.out.println(res);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}