import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n, k;
	int[] w;
	int ans;
	
	//入力
	public void input() {
		n = sc.nextInt();
		k = sc.nextInt();
		w = new int[n];
		for(int i=0; i<n; i++) { w[i] = sc.nextInt(); }
		ans = solve();
	}
	
	public int solve() {
		int left = 0;
		//荷物の個数*1個あたりの最大重量
		int right = 100000 * 10000;
		int mid;
		
		while(right-left > 1) {
			mid = (left+right) / 2;
			//mid == pを決めて何個積めるかチェック
			int v = check( mid );
			if(v >= n) right = mid;
			else left = mid;
		}
		return right;
	}
	
	//最大積載量pのk台のトラックえ何個の荷物を積めるか？
	public int check(int p) {
		int i = 0;
		for(int j=0; j<k; j++) {
			int s = 0;
			while(s+w[i] <= p) {
				s += w[i];
				i++;
				if(i == n) return n;
			}
		}
		return i;
	}
	
	public void output() {
		//答えの出力
		System.out.println( ans );
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

