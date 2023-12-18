import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main implements Runnable {
	static ContestScanner in;
	static Writer out;
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
	}
	
	public void run() {
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
		n = in.nextInt();
		node = new List[n];
		for(int i = 0; i < n; i++) node[i] = new ArrayList<>();
		for(int i = 0; i < n - 1; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			node[a].add(b);
			node[b].add(a);
		}
		dfs(0, -1, 0);
		int first = dfs2(s, ns);
		System.out.println(n - first * 2 < 0 ? "Fennec" : "Snuke");
	}
	
	int dfs2(int cur, int par) {
		int sum = 0;
		for(int v: node[cur]) {
			if(v == par) continue;
			sum += dfs2(v, cur);
		}
		return sum + 1;
	}
	
	List<Integer>[] node;
	int s;
	int ns;
	int nd;
	int n;
	int dfs(int cur, int par, int dist) {
		int plus = -1;
		for(int v: node[cur]) {
			if(v == par) continue;
			int d = dfs(v, cur, dist + 1);
			if(d >= 0) plus = d;
		}
		if(cur == n - 1) {
			nd = dist;
			plus = dist;
		}
		if(plus >= 0 && plus == nd / 2) {
			s = cur;
		} else if(plus >= 0 && plus == nd / 2 + 1) {
			ns = cur;
		}
		return plus - 1;
	}
}

@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public MultiSet<T> merge(MultiSet<T> set)
	{MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
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