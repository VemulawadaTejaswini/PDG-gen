import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int[] rlist = new int[r];
		for(int i = 0; i < r; i++){
		    rlist[i] = sc.nextInt() - 1;
		}
		int[][] dist = new int[n][n];
		for(int i = 0; i < m; i++){
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    int c = sc.nextInt();
		    dist[a][b] = c;
		    dist[b][a] = c;
		}
		
		// 計算
		int result = Integer.MAX_VALUE;
		wf(dist);
		Permutation perm = new Permutation(r);
		for(String s : perm.list){
		    int tmp = 0;
		    int from = rlist[s.charAt(0) - '0' - 1];
		    for(int i = 1; i < s.length(); i++){
		        int to = rlist[s.charAt(i) - '0' - 1];
		        tmp += dist[from][to];
		        from = to;
		    }
		    result = min(result, tmp);
		}
		
		// 出力
		System.out.println(result);
		
	}
	
	static void wf(int[][] dist) {
		int n = dist[0].length;
		int INF = 1001001001;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(dist[i][j] == 0) dist[i][j] = INF;
				if(i == j) dist[i][j] = 0;
			}
		}

		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}
}

class Permutation {
    int n;
    String s;
    ArrayList<String> list;
    long cnt = 0;
    
    public Permutation(String s){
        this.n = s.length();
        this.s = s;
        
        boolean[] used = new boolean[n];
        ArrayList<String> list = new ArrayList<String>();
        dfs("", used, list);
        this.list = list;
    }
    
    public Permutation(int n){
        this.n = n;
        StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
		    sb.append(i+1);
		}
        this.s = sb.toString();
        
        boolean[] used = new boolean[n];
        ArrayList<String> list = new ArrayList<String>();
        dfs("", used, list);
        this.list = list;
    }
    
    private void dfs(String s, boolean[] used, ArrayList<String> list){
        this.cnt++;
        if(s.length() == used.length){
            list.add(s);
            return;
        }
        for(int i = 0; i < used.length; i++){
            if(used[i]) continue;
            used[i] = true;
            dfs(s + this.s.charAt(i), used, list);
            used[i] = false;
        }
    }
}
