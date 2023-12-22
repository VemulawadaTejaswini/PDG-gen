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
import java.util.TreeMap;

public class Main {
	static ContestScanner in;static Writer out;public static void main(String[] args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
	in.close();out.close();}catch(IOException e){e.printStackTrace();}}
	static void dump(int[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
	static void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d",a[i]);out.println();}
	static void dump(long[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
	static void dump(char[]a){for(int i=0;i<a.length;i++)out.print(a[i]);out.println();}
	static long pow(long a,int n){long r=1;while(n>0){if((n&1)==1)r*=a;a*=a;n>>=1;}return r;}
	static String itob(int a,int l){return String.format("%"+l+"s",Integer.toBinaryString(a)).replace(' ','0');}
	static void sort(int[]a){m_sort(a,0,a.length,new int[a.length]);}
	static void sort(int[]a,int l){m_sort(a,0,l,new int[l]);}
	static void m_sort(int[]a,int s,int sz,int[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];
	} /* qsort(3.5s)<<msort(9.5s)<<<shuffle+qsort(17s)<Arrays.sort(Integer)(20s) */
	static void sort(long[]a){m_sort(a,0,a.length,new long[a.length]);}
	static void sort(long[]a,int l){m_sort(a,0,l,new long[l]);}
	static void m_sort(long[]a,int s,int sz,long[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];}
	static void swap(long[] a,int i,int j){final long t=a[i];a[i]=a[j];a[j]=t;}
	static void swap(int[] a,int i,int j){final int t=a[i];a[i]=a[j];a[j]=t;}
	static int binarySearchSmallerMax(int[]a,int v)// get maximum index which a[idx]<=v
	{int l=0,r=a.length-1,s=0;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return a[s]>v?-1:s;}
	void solve() throws NumberFormatException, IOException{
		int n = in.nextInt();
		int m = in.nextInt();
		char[] tmp = in.nextToken().toCharArray();
		int[] t = RollingHash.charToInt(tmp, 'a');
		long[][] s = new long[n][2];
		for(int i=0; i<n; i++) s[i][0] = s[i][1] = t[i];
		RollingHash rh = new RollingHash(m, n);
		rh.concat(s[0], 1);
		int left = 0;
		int right = 0;
		for(int i=0; i<m; i++){
			String q = in.nextToken();
			if(q.charAt(0)=='L'){
				if(q.charAt(1)=='+'){
					rh.removeTop(s[left++], 1);
				}else{
					rh.concatTop(s[--left], 1);
				}
			}else{
				if(q.charAt(1)=='+'){
					rh.concat(s[++right], 1);
				}else{
					rh.remove(s[right--], 1);
				}
			}
			rh.put();
		}
		System.out.println(rh.size());
	}
}

class RollingHash{
	final static int[] mod = {2078526727, 2117566807};
	final static int base = 257; // larger than 1byte prime
	private long[][] pow;
	private long[][] inv;
	private long[] stack;
	private long[] buf = new long[2];
	private int bufLen;
	private int sp;
	public RollingHash(int stackSize, int maxStrLen) {
		sp = 0;
		stack = new long[stackSize+1];
		initPow(maxStrLen);
		initInv(maxStrLen);
	}
	public RollingHash(int stackSize, int maxStrLen, boolean useRemove) {
		sp = 0;
		stack = new long[stackSize+1];
		initPow(maxStrLen);
		if(useRemove) initInv(maxStrLen);
	}
	void initPow(int len){
		pow = new long[2][len+1];
		for(int d=0; d<2; d++){
			pow[d][0] = 1;
			for(int i=1; i<=len; i++){
				pow[d][i] = pow[d][i-1]*base%mod[d];
			}
		}
	}
	void initInv(int len){
		inv = new long[2][len+1];
		for(int d=0; d<2; d++){
			inv[d][0] = 1;
			final long b = modinv(base, mod[d]);
			for(int i=1; i<=len; i++){
				inv[d][i] = inv[d][i-1]*b%mod[d];
			}
		}
	}
	long modinv(long n, long mod){
		return modpow(n, mod-2, mod);
	}
	long modpow(long n, long a, long mod){
		long res = 1;
		while(a > 0){
			if((a&1)==1) res = res*n%mod;
			n = n*n%mod;
			a >>= 1;
		}
		return res;
	}
	void clear(){
		sp = 0;
		clearBuff();
	}
	static int[] charToInt(char[] s, char baseChar){
		int[] res = new int[s.length];
		for(int i=0; i<s.length; i++) res[i] = s[i]-baseChar+1;
		return res;
	}
	static long[][][] preProcess(int[] s){
		final int n = s.length;
		long[][][] res = new long[n][n][2];
		for(int d=0; d<2; d++){
			for(int i=0; i<n; i++){
				res[i][i][d] = s[i];
				for(int j=i+1; j<n; j++){
					res[i][j][d] = (res[i][j-1][d]*base%mod[d]+s[j])%mod[d];
				}
			}
		}
		return res;
	}
	static long[][][] preProcess(char[] s, char baseChar){
		return preProcess(charToInt(s, baseChar));
	}
	void concat(long[] hash, long[] h, int len, int offset){
		for(int i=0; i<2; i++)
			hash[i] = (hash[i]*pow[i][len+offset]%mod[i]
					+h[i]*pow[i][offset]%mod[i])%mod[i];
	}
	void concat(long[] hash, long[] h, int len){
		for(int i=0; i<2; i++)
			hash[i] = (hash[i]*pow[i][len]%mod[i]+h[i])%mod[i];
	}
	void clearBuff(){
		bufLen = 0;
		Arrays.fill(buf, 0);
	}
	void concat(long[] h, int len){
		bufLen += len;
		concat(buf, h, len);
	}
	void concatTop(long[] h, int len){
		for(int i=0; i<2; i++)
			buf[i] = (buf[i]+h[i]*pow[i][bufLen]%mod[i])%mod[i];
		bufLen += len;
	}
	void remove(long[] hash, long[] h, int len){
		for(int i=0; i<2; i++)
			hash[i] = (hash[i]+mod[i]-h[i])%mod[i]*inv[i][len]%mod[i];
	}
	void remove(long[] h, int len){
		bufLen -= len;
		remove(buf, h, len);
	}
	void removeTop(long[] h, int len){
		bufLen -= len;
		for(int i=0; i<2; i++)
			buf[i] = (buf[i]+mod[i]-h[i]*pow[i][bufLen]%mod[i])%mod[i];
	}
	void put(){
		stack[sp++] = buf[0]<<32 | buf[1];
	}
	void put(long[] hash){
		stack[sp++] = hash[0]<<32 | hash[1];
	}
	int size(){
		Main.sort(stack, sp);
		stack[sp] = -1;
		int res = 0;
		for(int i=0; i<sp; i++) if(stack[i] != stack[i+1]) res++;
		return res;
	}
	static long realHash(String s, int d, char baseChar){
		long h = 0;
		for(int i=0; i<s.length(); i++)
			h = (h*base%mod[d]+s.charAt(i)-baseChar+1)%mod[d];
		return h;
	}
	String bufStr(){
		return buf[0]+" "+buf[1];
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