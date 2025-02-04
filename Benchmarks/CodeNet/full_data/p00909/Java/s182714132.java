import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static class WeightedUnionFind{
	    int[] par; // 親の番号
	    int[] ws;  // 親との重みの差
	    
	    public WeightedUnionFind(int n){
	        par = new int[n];
	        ws  = new int[n];
	        for(int i = 0; i < n; i++){ 
	        	par[i] = -1;
	        }
	    }
	    
	    public int find(int x){
	    	if(par[x] < 0){
	    		return x;
	    	}else{
	    		final int parent = find(par[x]);
	    		ws[x] += ws[par[x]];
	    		par[x] = parent;
	    		return parent;
	    	}
	    }
	    
	    public int weight(int x){
	    	return ws[x];
	    }
	    
	    public boolean union(int x, int y, int w){ // x <-(w)- y (x + w = y)
	    	find(x); find(y);
	    	w += weight(x);
	    	w -= weight(y);
	        x = find(x);
	        y = find(y);
	        
	        if(x != y){
	            if(par[y] < par[x]) {  // 多い方が根になるようにスワップする.
	                int tmp = x; x = y; y = tmp;
	                w = -w;
	            }
	            par[x] += par[y];
	            par[y] = x;
	            ws[y] = w;
	            
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    public boolean same(int x, int y){
	        return find(x) == find(y);
	    }
	    
	    public Integer diff(int x, int y){ // x - y を求める. 比較不能ならnull.
	    	if(!same(x, y)){
	    		return null;
	    	}else{
	    		return this.weight(x) - this.weight(y);
	    	}
	    }
	    
	    public int size(int x){
	        return -par[find(x)];
	    }
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			WeightedUnionFind uf = new WeightedUnionFind(n);
			
			for(int i = 0; i < m; i++){
				final String ops = sc.next();
				
				if("?".equals(ops)){
					final int r = sc.nextInt() - 1;
					final int l = sc.nextInt() - 1;
					
					if(!uf.same(r, l)){
						System.out.println("UNKNOWN");
					}else{
						System.out.println(uf.weight(l) - uf.weight(r));
					}
				}else{
					final int r = sc.nextInt() - 1;
					final int l = sc.nextInt() - 1;
					final int w = sc.nextInt();
					
					uf.union(r, l, w);
				}
			}
		}
		
		sc.close();
	}
	
	public static class Scanner {
	    private BufferedReader br;
	    private StringTokenizer tok;

	    public Scanner(InputStream is) throws IOException {
	        br = new BufferedReader(new InputStreamReader(is));
	    }

	    private void getLine() throws IOException {
	        while (!hasNext()) { tok = new StringTokenizer(br.readLine()); }
	    }

	    private boolean hasNext() {
	        return tok != null && tok.hasMoreTokens();
	    }

	    public String next() throws IOException {
	        getLine(); return tok.nextToken();
	    }

	    public int nextInt() throws IOException {
	        return Integer.parseInt(next());
	    }
	    // 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略
	    
	    public void close() throws IOException {
	        br.close();
	    }
	}
}