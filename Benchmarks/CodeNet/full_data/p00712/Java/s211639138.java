import java.util.*;
public class Main {
	int p,q,a,n, ans;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			p = sc.nextInt();
			q = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			if((p|q|a|n) == 0) break;
			ans = 0;
			dfs(0,0,1,1, 1);
			System.out.println(ans);
		}
	}
	
	private void dfs(int deep, int aa, int bb, int mul,int  prev) {
		if(p * bb == q * aa){
			ans++;
			return ;
		}
		if(deep == n) return;
		if(p * bb < q * aa)return;
		
		for(int i = prev; i * mul <= a; i++){
			dfs(deep + 1, bb * 1 + aa * i, bb * i, i * mul, i);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}