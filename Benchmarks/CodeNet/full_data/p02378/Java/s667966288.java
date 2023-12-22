import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException,
	IOException {Solve solve = new Solve();solve.solve();}
}
class Solve{
	HashSet<Integer>[] node;
	void solve() throws NumberFormatException, IOException{
		ContestScanner in = new ContestScanner();
		Writer out = new Writer();
		int x = in.nextInt();
		int y = in.nextInt();
		int e = in.nextInt();
		Matching2 mat = new Matching2(x, y);
		for(int i=0; i<e; i++){
			mat.edge(in.nextInt(), in.nextInt());
		}
		System.out.println(mat.solve());
	}
}

class Matching2{
	int n, m;
	BitSet[] cap;
	public Matching2(int n, int m) {
		this.n = n;
		this.m = m;
		cap = new BitSet[n+m+2];
		for(int i=0; i<n+m+2; i++){
			cap[i] = new BitSet(n+m+2);
		}
		for(int i=0; i<n+m; i++){
			if(i<n) cap[n+m].set(i);
			else cap[i].set(n+m+1);
		}
	}
	void edge(int left, int right){
		cap[left].set(n+right);
	}
	int solve(){
		int res = 0;
		while(true){
			used.clear();
			boolean flow = flow(n+m, true);
			if(!flow) break;
			res += flow?1:0;
		}
		return res;
	}
	BitSet used = new BitSet();
	boolean flow(int id, boolean flow){
		if(id == m+n+1) return flow;
		if(used.get(id)) return false;
		used.set(id);
		for(int v=cap[id].nextSetBit(0);
				v!=-1; v=cap[id].nextSetBit(v+1)){
			boolean f = flow(v, flow & cap[id].get(v));
			if(!f) continue;
			cap[id].clear(v);
			cap[v].set(id);
			return f;
		}
		return false;
	}
}
class MultiSet<T> extends HashMap<T, Integer>{
	@Override
	public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){
		final int num = get(key);
		if(num==1) remove(key);
		else put(key, num-1);
	}
}
class Timer{
	long time;
	public void set(){time = System.currentTimeMillis();}
	public long stop(){return System.currentTimeMillis()-time;}
}
class Writer extends PrintWriter{
	public Writer(String filename) throws IOException
	{super(new BufferedWriter(new FileWriter(filename)));}
	public Writer() throws IOException{super(System.out);}
}
class ContestScanner {
	private BufferedReader reader;
	private String[] line;
	private int idx;
	public ContestScanner() throws FileNotFoundException 
	{reader = new BufferedReader(new InputStreamReader(System.in));}
	public ContestScanner(String filename) throws FileNotFoundException
	{reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
	public String nextToken() throws IOException {
		if (line == null || line.length <= idx) {
			line = reader.readLine().trim().split(" ");
			idx = 0;
		}
		return line[idx++];
	}
	public String readLine() throws IOException{return reader.readLine();}
	public long nextLong() throws IOException, NumberFormatException
	{return Long.parseLong(nextToken());}
	public int nextInt() throws NumberFormatException, IOException
	{return (int) nextLong();}
	public double nextDouble() throws NumberFormatException, IOException 
	{return Double.parseDouble(nextToken());}
}