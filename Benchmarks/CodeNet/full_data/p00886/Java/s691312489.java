
import java.util.*;
public class Main {

	
	int [] hash, pos;
	int max, n;
	int size = 400;
	ArrayList<String> anslist;
	HashSet<String> dup;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			max = sc.nextInt();
			hash = new int[size + 1];
			for(int i = 0 ; i < n * (n - 1) / 2 - 1; i++){
				hash[sc.nextInt()]++;
			}
			pos = new int[n];
			pos[0] = 0;
			pos[n-1] = max;
			anslist = new ArrayList<String>();
			dup = new HashSet<String>();
			dfs(0,0,n-1);
			for(int i = 0 ; i < anslist.size(); i++){
				System.out.println(anslist.get(i));
			}
			System.out.println("-----");
		}
	}
	
	private void dfs(int deep, int left, int right) {
		if(deep == n - 2){
			//System.out.println(Arrays.toString(pos));
			String str = tostr();
			if(dup.contains(str)) return;
			dup.add(str);
			anslist.add(str);
			return ;
		}
		
		int cand = max;
		for(;hash[cand] <= 0;cand--){
			if(cand == 0) break;
		}
		int pair = max - cand;
		if(hash[cand] < 0 || hash[pair] < 0) return ;
		pos[left + 1] = pair;
		dfs2(deep, left, right, pair, 0);
		pos[left + 1] = 0;
		pos[right - 1] = cand;
		dfs2(deep, left, right, cand, 1);
		pos[right - 1] = 0;
		
	}

	private void dfs2(int deep, int left, int right, int cand, int digit) {
		int nright = -1, nleft = -1;
		if(digit == 1){
			nright = right -1;
			nleft = left;
		}
		else{
			nright = right;
			nleft = left + 1;
		}
		
		for(int i = 0 ; i <= left; i++){
			if(hash[cand - pos[i]] <= 0){
				return ;
			}
		}
		
		for(int i = 0 ; i <= left; i++){
			hash[cand - pos[i]]--;
		}
		
		boolean flg = false;
		for(int i = right; i < n; i++){
			if(hash[pos[i] - cand] <= 0){
				flg = true;
				break;
			}
		}
		
		if(! flg){
			for(int i = right; i < n; i++){
				hash[pos[i] - cand]--;
			}
			
			dfs(deep + 1, nleft, nright);
			
			for(int i = right; i < n; i++){
				hash[pos[i] - cand]++;
			}
		}
		for(int i = 0 ; i <= left; i++){
			hash[cand - pos[i]]++;
		}
	}

	private String tostr() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i< pos.length; i++){
			sb.append(" " + (pos[i] - pos[i-1]));
		}
		return sb.substring(1);
	}

	public static void main(String [] args){
		new Main().doit();
	}
}