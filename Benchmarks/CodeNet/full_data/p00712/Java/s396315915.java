import java.util.*;
public class Main {
	int p,q,a,n;
	int ans;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			p = sc.nextInt();
			q = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			if((p|q|a|n) == 0) break;
			ans = 0;
			int g = gcd(p,q);
			p =  p / g;
			q =  q / g;
			dfs(0,0,1,1, 1);
			System.out.println(ans);
		}
	}
	
	private void dfs(int deep, int aa, int bb, int mul,int  prev) {
		
		if(aa == p && bb == q){
			ans++;
			return ;
		}
		if(deep == n){
			return;
		}
		if(isbig(aa, bb))return;
		
		for(int i = prev; i * mul <= a; i++){
			int [] res = calc(aa,bb, 1, i);
			dfs(deep + 1, res[0], res[1], i * mul, i);
		}
	}

	private boolean isbig(int aa, int bb) {
		int a = p * bb;
		int b = q * aa;
		if(a < b) return true;
		return false;
	}

	private int[] calc(int aa, int bb, int cc, int dd) {
		int [] res = new int[2];
		int up = bb * cc + aa * dd;
		int down = bb * dd;
		int div = gcd(up, down);
		res[0] = up / div;
		res[1] = down / div;
		//System.out.println("aa = " + aa + "bb= " + bb + "cc = " + cc + "dd = " + dd + "= " + res[0] + " " + res[1]);
		return res;
	}

	private int gcd(int a, int b) {
		if(b == 0){
			return a;
		}
		else{
			return gcd(b, a % b);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}