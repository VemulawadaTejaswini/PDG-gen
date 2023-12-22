import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;


class UnionFind{
	int Parent[];
	UnionFind(int n){//Initialize by -1
		Parent=new int[n];
		Arrays.fill(Parent, -1);
	}
	int root(int A) {//In which tree is A?
		if(Parent[A]<0)return A;
		return Parent[A]=root(Parent[A]);
    }
	int size(int A) {//size of tree which is include A
		return -Parent[root(A)];
	}
	boolean connect(int A,int B) {//Connect A and B
		A=root(A);
		B=root(B);
		if(A==B) return false;
		if(size(A)<size(B)) {int C=0;C=B;B=A;A=C;}//SWAP
		Parent[A]+=Parent[B];
		Parent[B]=A;
		return true;
	}
}
class Pair<T,E>{
	public T first;
	public E second;
	void set(T x,E y){
		first=x;
		second=y;
	}
}	
class PInt{
	public int first;
	public int second;
	PInt(int x,int y){
		first=x;
		second=y;
	}
	void set(int x,int y){
		first=x;
		second=y;
	}
}
class Tpair{
	public int first;
	public int second;
	public long third;
	Tpair(int x,int y,long z){
		first=x;
		second=y;
		third=z;
	}
	void set(int x,int y,long z){
		first=x;
		second=y;
		third=z;
    }
}
public class Main {
	static FastScanner scan=new FastScanner();
	static Scanner scanner=new Scanner(System.in);
	static Random rand=new Random();
	static long mod=1000000007;
	static double eps=1.0E-14;
	static int big=Integer.MAX_VALUE;
	static double PI=3.14159265358979323846262338327950288;
	static long modlcm(long a,long b) {return a*b*modint(gcd(a,b),mod);}
	static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
	static long lcm (long a, long b) {return a*b/gcd(a,b);}
	static int max(int a,int b) {return a>b?a:b;}
	static int min(int a,int b) {return a<b?a:b;}
	static long lmax(long a,long b) {return Math.max(a, b);}
	static long lmin(long a,long b) {return Math.min(a, b);}
	static long factorial(int i) {return i==1?1:i*factorial(i-1);}
	public static void main(String[]$) throws IOException{
		while(true) {
			int w=scan.nextInt();
			int h=scan.nextInt();
			if(h==0&&w==0)return;
			boolean map[][][]=new boolean[h][w][4];
			//0:U 1:D 2:L 3:R
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					map[i][j][0]=true;
					map[i][j][1]=true;
					map[i][j][2]=true;
					map[i][j][3]=true;
					if(i==0) map[i][j][0]=false;
					if(i==h-1)map[i][j][1]=false;
					if(j==0)map[i][j][2]=false;
					if(j==w-1)map[i][j][3]=false;
				}
			}
			for(int i=0;i<h+h-1;i++) {
				int retu=i/2;
				if(i%2==0) {
					for(int j=0;j<w-1;j++) {
						int x=scan.nextInt();
						if(x==1) {
							map[retu][j][3]=false;
							map[retu][j+1][2]=false;
						}
					}
				}
				else {
					for(int j=0;j<w;j++) {
						int x=scan.nextInt();
						if(x==1) {
							map[retu][j][1]=false;
							map[retu+1][j][0]=false;
						}
					}
				}
			}
			boolean visited[][]=new boolean[h][w];
			Deque<Tpair>q=new ArrayDeque<Tpair>();
			q.add(new Tpair(0,0,1));
			boolean b=false;
			while(q.size()>0) {
				Tpair tp=q.poll();
				if(tp.first==w-1&&tp.second==h-1) {
					System.out.println(tp.third);
					b=true;
					break;
				}
				if(map[tp.second][tp.first][0]&&!visited[tp.second-1][tp.first]) {
					q.add(new Tpair(tp.first,tp.second-1,tp.third+1));
					visited[tp.second-1][tp.first]=true;
				}
				if(map[tp.second][tp.first][1]&&!visited[tp.second+1][tp.first]) {
					q.add(new Tpair(tp.first,tp.second+1,tp.third+1));
					visited[tp.second+1][tp.first]=true;
				}
				if(map[tp.second][tp.first][2]&&!visited[tp.second][tp.first-1]) {
					q.add(new Tpair(tp.first-1,tp.second,tp.third+1));
					visited[tp.second][tp.first-1]=true;
				}
				if(map[tp.second][tp.first][3]&&!visited[tp.second][tp.first+1]) {
					q.add(new Tpair(tp.first+1,tp.second,tp.third+1));
					visited[tp.second][tp.first+1]=true;
				}
			}
			if(!b)System.out.println(0);
		}
	}
	static int lower_bound(int a[],int key) {
		int ok=a.length;
		int ng=-1;
		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;
			if(a[mid]>=key)ok=mid;
			else ng=mid;
		}
		return ok;
	}
	static int upper_bound(int a[],int key) {
		int ok=a.length;
		int ng=-1;
		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;
			if(a[mid]>key)ok=mid;
			else ng=mid;
		}
		return ok;
	}
	static boolean isPrime (long n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
		return true;
	}
	static int upper_division(int a,int b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lupper_division(long a,long b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static int[] setArray(int a) {
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
		}
		return b;
	}
	static long[] lsetArray(int a) {
		long b[]=new long[a];
		for(int i=0;i<a;i++) {
			b[i]=scan.nextLong();
		}
		return b;
	}
	static String reverse(String str) {
		char ch[]=new char[str.length()];
		char chch[]=str.toCharArray();
		int a=str.length();
		for(int i=0;i<upper_division(a,2);i++) {
			ch[i]=chch[ch.length-i-1];
			ch[ch.length-1-i]=chch[i];
		}
		return String.valueOf(ch);
	}
	public static void printArray(int[] que) {
		for(int i=0;i<que.length-1;i++) {
			System.out.print(que[i]+" ");
		}
		System.out.println(que[que.length-1]);
	}
	public static void lprintArray(long[] que) {
		for(int i=0;i<que.length-1;i++) {
			System.out.print(que[i]+" ");
		}
		System.out.println(que[que.length-1]);
	}
	public static int[][] doublesort(int[][]a) {
		Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
		return a;
	}
	public static long[][] ldoublesort(long[][]a) {
		Arrays.sort(a,(x,y)->Long.compare(x[0],y[0]));
		return a;
	}
	static long modpow(long x,long n,long mo) {
	        long sum=1;
	        while(n>0) {
	            if((n&1)==1) {
	                sum=sum*x%mo;
	            }
	            x=x*x%mo;
	            n>>=1;
	        }
	        return sum;
	    }
	public static char[] revch(char ch[]) {
		char ret[]=new char[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
	public static int[] revint(int ch[]) {
		int ret[]=new int[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
	public static void warshall_floyd(int v[][],int n) {
		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					v[i][j]=min(v[i][j],v[i][k]+v[k][j]);
	}	
	public static long modint(long a,long m) {
		long b=m,u=1,v=0;
		while(b!=0) {
			long t=a/b;
			a-=t*b;
			long x=a;
			a=b;
			b=x;
			
			u-=t*v;
			x=u;
			u=v;
			v=x;
		}
		u%=m;
		if(u<0)u+=m;
		return u;
	}
}	
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
}	
