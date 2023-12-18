import java.io.*;
import java.util.*;
 
public class Main {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    void solve() throws IOException {
    	int n = in.nextInt();
    	int m = in.nextInt();
    	int r = in.nextInt();
    	int[] t = new int[r];
    	for(int i = 0; i < r; i++) {
    		t[i] = in.nextInt() - 1;
    	}
    	int[][] dist = new int[n][n];
    	int inf = Integer.MAX_VALUE / 2;
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++) {
    			if(i == j) continue;
    			dist[i][j] = inf;
    		}
    	}
    	for(int i = 0; i < m; i++) {
    		int a = in.nextInt() - 1;
    		int b = in.nextInt() - 1;
    		int c = in.nextInt();
    		dist[a][b] = dist[b][a] = Math.min(dist[a][b], c);
    	}
    	
    	for(int k = 0; k < n; k++)
        	for(int i = 0; i < n; i++)
            	for(int j = 0; j < n; j++)
            		dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
    	Permutation p = new Permutation(r, r);
    	int min = inf;
    	while(p.next()) {
    		int res = 0;
    		for(int i = 1; i < r; i++) {
    			res += dist[t[p.p[i - 1]]][t[p.p[i]]];
    		}
    		min = Math.min(min, res);
    	}
        System.out.println(min);
        		
    		
    }
 
}

class Permutation{
	// max=10
	// n=10: 160ms
	// n=11: 1600-1700ms
	int n;
	int max;
	BitSet used;
	int[] p;
	public Permutation(int n, int max){
		this.n = n;
		this.max = max;
		used = new BitSet(n);
		p = new int[n];
	}
	
	public boolean next(){
		if(used.cardinality() == 0){
			for(int i=0; i<n; i++){
				p[i] = i;
			}
			used.set(0, n);
			return true;
		}
		int i;
		for(i=n-1; i>=0; i--){
			used.clear(p[i]);
			if((used.nextClearBit(p[i]+1)) < max) break;
		}
		if(i<0) return false;
		p[i] = used.nextClearBit(p[i]+1);
		used.set(p[i]);
		int idx = i+1;
		for(i=used.nextClearBit(0); i<max && idx<n; i=used.nextClearBit(i+1)){
			p[idx++] = i;
			used.set(i);
		}
		return true;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
			sb.append(p[i]+" ");
		}
		return sb.toString();
	}
}
 
@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Long>{
    @Override public Long get(Object key){return containsKey(key)?super.get(key):0L;}
    public void add(T key,long v){put(key,get(key)+v);}
    public void add(T key){put(key,get(key)+1);}
    public void sub(T key){final long v=get(key);if(v==1)remove(key);else put(key,v-1);}
    public MultiSet<T> merge(MultiSet<T> set)
    {MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
        for(Entry<T,Long>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
}
 
class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
        while((c=in.read())!=-1&&Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}