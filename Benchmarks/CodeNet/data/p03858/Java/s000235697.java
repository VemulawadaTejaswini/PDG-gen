import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main implements Runnable{
	static ContestScanner in;static Writer out;
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
	}
	public void run() {
		try {
			in = new ContestScanner();
			out = new Writer();
			Main solve = new Main();
			solve.solve();
			in.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void dump(int[]a){StringBuilder s=new StringBuilder();for(int i=0;i<a.length;i++)
	s.append(a[i]).append(" ");out.println(s.toString().trim());}
	static void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d ",a[i]);out.println();}
	static void dump(long[]a){StringBuilder s=new StringBuilder();for(int i=0;i<a.length;i++)
	s.append(a[i]).append(" ");out.println(s.toString().trim());}
	static void dump(char[]a){for(int i=0;i<a.length;i++)out.print(a[i]);out.println();}
	static long pow(long a,int n){long r=1;while(n>0){if((n&1)==1)r*=a;a*=a;n>>=1;}return r;}
	static String itob(int a,int l){return String.format("%"+l+"s",Integer.toBinaryString(a)).replace(' ','0');}
	static void sort(int[]a){m_sort(a,0,a.length,new int[a.length]);}
	static void sort(int[]a,int l){m_sort(a,0,l,new int[l]);}
	static void sort(int[]a,int l,int[]buf){m_sort(a,0,l,buf);}
	static void sort(int[]a,int s,int l,int[]buf){m_sort(a,s,l,buf);}
	static void m_sort(int[]a,int s,int sz,int[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];
	} /* qsort(3.5s)<<msort(9.5s)<<<shuffle+qsort(17s)<Arrays.sort(Integer)(20s) */
	static void sort(long[]a){m_sort(a,0,a.length,new long[a.length]);}
	static void sort(long[]a,int l){m_sort(a,0,l,new long[l]);}
	static void sort(long[]a,int l,long[]buf){m_sort(a,0,l,buf);}
	static void sort(long[]a,int s,int l,long[]buf){m_sort(a,s,l,buf);}
	static void m_sort(long[]a,int s,int sz,long[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];}
	static void swap(long[] a,int i,int j){final long t=a[i];a[i]=a[j];a[j]=t;}
	static void swap(int[] a,int i,int j){final int t=a[i];a[i]=a[j];a[j]=t;}
	static int binarySearchSmallerMax(int[]a,int v)// get maximum index which a[idx]<=v
	{int l=-1,r=a.length-1,s=0;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	static int binarySearchSmallerMax(int[]a,int v,int l,int r)
	{int s=-1;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	@SuppressWarnings("unchecked")
	static List<Integer>[]createGraph(int n)
    {List<Integer>[]g=new List[n];for(int i=0;i<n;i++)g[i]=new ArrayList<>();return g;}
	void solve() throws IOException{
		int n = in.nextInt();
		int a = in.nextInt()-1;
		int b = in.nextInt()-1;
		x = new long[n];
		y = new long[n];
		for(int i=0; i<n; i++){
			Pos p = new Pos(in.nextDouble(), in.nextDouble());
			p.rotate(Math.PI/4);
			p.scale(Math.sqrt(2));
			x[i] = (long)(Math.round(p.x));
			y[i] = (long)(Math.round(p.y));
			put(x[i], y[i], i);
		}
		createNewMap();
		dist = Math.max(Math.abs(x[a]-x[b]), Math.abs(y[a]-y[b]));
		boolean[] used = new boolean[n];
		used[a] = true;
		used[b] = true;
		Queue<Integer> qu = new ArrayDeque<>(n);
		stack = new int[n*2];
		TreeSet<Integer>[] edge = new TreeSet[n];
		for(int i=0; i<n; i++){
			edge[i] = new TreeSet<>();
		}
		edge[a].add(b);
		edge[b].add(a);
		qu.add(a);
		qu.add(b);
		while(!qu.isEmpty()){
			final int id = qu.poll();
			setNexts(id);
			while(sp>0){
				final int next = stack[--sp];
				edge[id].add(next);
				edge[next].add(id);
				if(used[next]) continue;
				used[next] = true;
				qu.add(next);
			}
		}
		long ans = 0;
		for(int i=0; i<n; i++){
			ans += edge[i].size();
		}
		System.out.println(ans/2);
	}
	
	long[] x, y;
	long dist;
	int[] stack;
	int sp;
	void setNexts(int from){
		sp = 0;
		setAxis(y[from]-dist, y[from]+dist, xMap.get(x[from]-dist));
		setAxis(y[from]-dist, y[from]+dist, xMap.get(x[from]+dist));
		setAxis(x[from]-dist, x[from]+dist, yMap.get(y[from]-dist));
		setAxis(x[from]-dist, x[from]+dist, yMap.get(y[from]+dist));
	}
	
	final int mask = (1<<20)-1;
	void setAxis(long from, long to, long[] ord){
		if(ord==null) return;
		int begin = Arrays.binarySearch(ord, from<<20);
		if(begin<0){
			begin = -begin-1;
		}
		final long brd = to+1<<20;
		for(int i=begin; i<ord.length && ord[i]<brd; i++){
			stack[sp++] = (int)(ord[i] & mask);
		}
//		for(int e: map.subMap(from, to+1).values()){
//			stack[sp++] = e;
//		}
	}
	
	TreeMap<Long, TreeMap<Long, Integer>> mapX = new TreeMap<>();
	TreeMap<Long, TreeMap<Long, Integer>> mapY = new TreeMap<>();
	void put(long x, long y, int id){
		TreeMap<Long, Integer> mx, my;
		if(mapX.containsKey(x)){
			mx = mapX.get(x);
		}else{
			mx = new TreeMap<>();
			mapX.put(x, mx);
		}
		if(mapY.containsKey(y)){
			my = mapY.get(y);
		}else{
			my = new TreeMap<>();
			mapY.put(y, my);
		}
		mx.put(y, id);
		my.put(x, id);
	}
	
	TreeMap<Long, long[]> xMap, yMap;
	void createNewMap(){
		xMap = createNewMap(mapX);
		yMap = createNewMap(mapY);
	}
	
	TreeMap<Long, long[]> createNewMap(TreeMap<Long, TreeMap<Long, Integer>> map){
		TreeMap<Long, long[]> res = new TreeMap<>();
		for(Entry<Long, TreeMap<Long, Integer>> e: map.entrySet()){
			res.put(e.getKey(), toArray(e.getValue()));
		}
		return res;
	}
	
	long[] toArray(TreeMap<Long, Integer> map){
		long[] res = new long[map.size()];
		int p = 0;
		for(Entry<Long, Integer> e: map.entrySet()){
			res[p++] = e.getKey()<<20 | e.getValue();
		}
		return res;
	}
}

class Pos implements Comparable<Pos>{
	static final double EPS = 1e-10;
	double x, y;
	public Pos(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double dist2(Pos p){
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y);
	}
	public void scale(double s){
		x *= s;
		y *= s;
	}
	public void rotate(double rad){
		final double newX = x*Math.cos(rad) - y*Math.sin(rad);
		final double newY = x*Math.sin(rad) + y*Math.cos(rad);
		x = newX;
		y = newY;
	}
	public void move(double dx, double dy){
		x += dx;
		y += dy;
	}
	@Override
	public int compareTo(Pos o) {
		if(Math.abs(x-o.x) >= EPS) return Double.compare(x, o.x);
		if(Math.abs(y-o.y) >= EPS) return Double.compare(y, o.y);
		return 0;
	}
	@Override
	public String toString() {
		return String.format("(%5f, %5f)", x, y);
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
@SuppressWarnings("serial")
class OrderedMultiSet<T> extends TreeMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public OrderedMultiSet<T> merge(OrderedMultiSet<T> set)
	{OrderedMultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	while(!s.isEmpty()){l.add(s.firstEntry().getKey(),s.pollFirstEntry().getValue());}return l;}
}
class Pair implements Comparable<Pair>{
	int a,b;final int hash;Pair(int a,int b){this.a=a;this.b=b;hash=(a<<16|a>>16)^b;}
	public boolean equals(Object obj){Pair o=(Pair)(obj);return a==o.a&&b==o.b;}
	public int hashCode(){return hash;}
	public int compareTo(Pair o){if(a!=o.a)return a<o.a?-1:1;else if(b!=o.b)return b<o.b?-1:1;return 0;}
}
class Timer{
	long time;public void set(){time=System.currentTimeMillis();}
	public long stop(){return time=System.currentTimeMillis()-time;}
	public void print(){System.out.println("Time: "+(System.currentTimeMillis()-time)+"ms");}
	@Override public String toString(){return"Time: "+time+"ms";}
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