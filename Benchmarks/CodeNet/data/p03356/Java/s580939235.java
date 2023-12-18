import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		
		int p[] = new int[n];
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			p[i] = Integer.parseInt(tmpArray[i]);
		}
		
		Pair[] pairs = new Pair[m];

		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");
			int x = Integer.parseInt(tmpArray[0]);
			int y = Integer.parseInt(tmpArray[1]);
			
			pairs[i] = new Pair(x, y);
		}
		
		DisjointSet set = new DisjointSet(n);
		
		for(int i = 0; i < m; i++){
			set.union(pairs[i].x, pairs[i].y);
		}
		
		int result = 0;
		for(int i = 1; i <= n; i++){
			if(p[i - 1] == i){
				result++;
			}
			
			else if(set.isSameSet(p[i - 1], i)){
				result++;
//				System.out.println(p[i - 1] + " and "+i+" is same set");
			}
		}
		
		System.out.println(result);
	}

}

class DisjointSet {
    private int n;
    private int[] p;
    private int[] rank;
 
    public DisjointSet(int n){
        this.n = n;
 
        p = new int[n + 1];
        rank = new int[n + 1];
 
        for(int i = 1; i <= n; i++){
            makeSet(i);
        }
    }
 
    private void makeSet(int x){
        p[x] = x;
        rank[x] = 0;
    }
 
    public void union(int x, int y){
        link (findSet(x), findSet(y));
    }
 
    private int findSet(int x){
        if(x != p[x]){
            p[x] = findSet( p[x]);
        }
        return p[x];
    }
 
    public boolean isSameSet(int x, int y){
        return findSet(x) == findSet(y);
    }
 
    private void link(int x, int y){
        if(rank[x] > rank[y]){
            p[y] = x;
        }
        else {
            p[x] = y;
            if(rank[x] == rank[y]){
                rank[y]++;
            }
        }
    }
}

class Pair {
	int x;
	int y;
	
	public Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
