import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Main {
	static ContestScanner in;static Writer out;public static void main(String[] args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
	in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
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
		int x = in.nextInt();
		int[] res = getArr(n, x);
		if(res==null){
			System.out.println("No");
		}else{
			out.println("Yes");
			for(int i=0; i<res.length; i++){
				out.println(res[i]);
			}
		}
	}
	
	int[] getArr(int n, int x){
		if(x==1 || x==n*2-1){
			return null;
		}
		if(n<5){
			int[] a = solveBrute(n, x);
			return a;
		}
		boolean[] used = new boolean[n*2];
		int maxV = n*2-1;
		int[] ans = new int[n*2-1];
		if(x!=maxV-1){
			ans[n-1] = x;
			ans[n] = 1;
			ans[n+1] = x+1;
			ans[n-2] = maxV;
			used[x] = used[1] = used[x+1] = used[maxV] = true;
		}else{
			ans[n-1] = x;
			ans[n] = 1;
			ans[n-2] = maxV;
			ans[n-3] = x-1;
			used[x] = used[1] = used[x-1] = used[maxV] = true;
		}
		int id = 1;
		for(int i=0; i<maxV; i++){
			while(used[id]) id++;
			if(ans[i]!=0) continue;
			ans[i] = id;
			used[id] = true;
		}
		return ans;
	}
	
	boolean check(int[] d, int x){
		int i = d.length/2+1;
		System.out.println(Arrays.toString(d));
		for(int j=1; j<i; j++){
			int[] next = new int[i*2-1];
			for(int k=j; k<i*2-1-j; k++){
				next[k] = med(d[k-1], d[k], d[k+1]);
			}
			d = next;
			System.out.println(Arrays.toString(d));
		}
		return d[i-1]==x;
	}
	
	int[] solveBrute(int i, int x){
		int[] d = new int[i*2-1];
		Permutation p = new Permutation(i*2-1, i*2-1);
		while(p.next()){
			for(int j=0; j<i*2-1; j++) d[j] = p.p[j]+1;
			for(int j=1; j<i; j++){
				if(i==5) System.out.println(Arrays.toString(d));
				int[] next = new int[i*2-1];
				for(int k=j; k<i*2-1-j; k++){
					next[k] = med(d[k-1], d[k], d[k+1]);
				}
				d = next;
			}
			if(d[i-1]==x){
				for(int j=0; j<p.p.length; j++){
					p.p[j]++;
				}
				return p.p;
			}
		}
		return null;
	}
	
	int[] arr = new int[3];
	int med(int a, int b, int c){
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		Arrays.sort(arr);
		return arr[1];
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