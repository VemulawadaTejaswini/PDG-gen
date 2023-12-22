import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class Main {
	static ContestScanner in;static Writer out;public static void main(String[]args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve(in,out);
	in.close();out.close();}catch(IOException e){e.printStackTrace();}}
	void dump(int[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
	void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d",a[i]);out.println();}
	void dump(long[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
	void dump(char[]a){for(int i=0;i<a.length;i++)out.print(a[i]);out.println();}
	long pow(long a,int n){long r=1;while(n>0){if((n&1)==1)r*=a;a*=a;n>>=1;}return r;}
	String itob(int a,int l){return String.format("%"+l+"s",Integer.toBinaryString(a)).replace(' ','0');}
	void sort(int[]a){m_sort(a,0,a.length,new int[a.length]);}
	void m_sort(int[]a,int s,int sz,int[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a,j,j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];
	} /* qsort(3.5s)<<msort(9.5s)<<<shuffle+qsort(17s)<Arrays.sort(Integer)(20s) */
	void swap(int[]a,int i,int j){final int t=a[i];a[i]=a[j];a[j]=t;}
	int binarySearchSmallerMax(int[]a,int v)// get maximum index which a[idx]<=v
	{int l=0,r=a.length-1,s=0;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return a[s]>v?-1:s;}
	void solve(ContestScanner in,Writer out)throws NumberFormatException,IOException{
		int n = in.nextInt();
		int q = in.nextInt();
		RangeFuncSegTree st = new RangeFuncSegTree(n, Integer.MAX_VALUE, (x, y)->Math.min(x, y));
		for(int i=0; i<q; i++){
			int c = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			if(c==0){
				st.set(x, y);
			}else{
				out.println(st.find(x, y));
			}
		}
	}
}
interface STFunc{int culc(int x, int y);}
class RangeFuncSegTree{
	STFunc f;
	int[] tree;
	int size, len, n, init;
	public RangeFuncSegTree(int n, int initValue, STFunc f){
		this.f = f;
		int beki = 1;
		while(beki < n) beki <<= 1;
		len = beki<<1;
		this.n = n;
		tree = new int[len];
		Arrays.fill(tree, initValue);
		init = initValue;
		size = beki;
	}
	public void set(int id, int x){
		int i = id | size; tree[i] = x;
		for(i>>=1; i>0; i>>=1) tree[i] = f.culc(tree[i<<1], tree[(i<<1)+1]);
	}
	public int get(int id){
		return tree[id|size];
	}
	// in idx: left to right
	public int find(int left, int right){
		int res = init;
		left |= size;
		right|= size;
		right++;
		while(left < right){
			if((right&1) == 1) res = f.culc(res, tree[--right]);
			if((left&1) == 1) res = f.culc(res, tree[left++]);
			right >>= 1;
			left >>= 1;
		}
		return res;
	}
	public String output(int idx){
		StringBuilder sb = new StringBuilder();
		for(int i=size; i<=size+idx; i++) sb.append(tree[i]+" ");
		return sb.toString();
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int e=2, s=1; e<=len; e<<=1){
			for(;s<e; s++) sb.append(tree[s]).append(" ");
			sb.append("\n");
		}
		return sb.toString();
	}
}


class MultiSet<T> extends HashMap<T, Integer>{
	@Override
	public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key)
	{final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
}
class OrderedMultiSet<T> extends TreeMap<T, Integer>{
	@Override
	public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key)
	{final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
}
class Pair implements Comparable<Pair>{
	int a,b;int hash;Pair(int a,int b){this.a=a;this.b=b;hash=(a<<16|a>>16)^b;}
	public boolean equals(Object obj){Pair o=(Pair)(obj);return a==o.a&&b==o.b;}
	public int hashCode(){return hash;}
	public int compareTo(Pair o){if(a!=o.a)return a<o.a?-1:1;else if(b!=o.b)return b<o.b?-1:1;return 0;}
}
class Timer{
	long time;
	public void set(){time=System.currentTimeMillis();}
	public long stop(){return time=System.currentTimeMillis()-time;}
	public void print()
	{System.out.println("Time: "+(System.currentTimeMillis()-time)+"ms");}
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