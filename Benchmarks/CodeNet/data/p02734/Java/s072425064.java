
import java.io.*;
import java.io.IOException;
import java.util.*;
//import java.util.concurrent.LinkedBlockingDeque;

//import sun.net.www.content.audio.wav;

import java.text.DecimalFormat;
 
class Main {
	
	public static long mod = (long)Math.pow(10, 9)+7 ;
	public static double epsilon=0.00000000008854;//value of epsilon
	public static InputReader sc = new InputReader(System.in);
	public static PrintWriter pw = new PrintWriter(System.out);
	
	public static long gcd(long a,long b){
		while(b>0){
			long t=b;
			b=a%b;
			a=t;
		}
		return a;
	}
	public static int firstNode(int a,int p[]){
		if(a!=p[a]){
			p[a]=firstNode(p[a], p);
		}
		return p[a];
	}
	public static void Union(int a,int b,int p[]){
		//int a=firstNode(a1, p);
		//int b=firstNode(b1, p);
		/*if(a!=b){
			if(r[a]<r[b]){
				p[a]=b;
			}
			else if(r[a]>r[b]){
				p[b]=a;
			}
			else{
				r[b]++;
				p[a]=b;
			}
		}*/
		//if(a!=b)
		p[firstNode(a,p)]=firstNode(b,p);//if no rank than 
	}
	public static int countSet(int a){
		int c=0;
		while(a>0){
			a&=(a-1);
			c++;
		}
		return c;
	}

	public static int dis(int i,int d[],int p[]){
		if(d[i]!=0){
			return d[i];
		}
		else if(p[i]==-1){
			return d[i]=1;
		}
		else return d[i]=1+dis(p[i], d, p);
	}

	public static int hieght(int r,int h[],ArrayList<ArrayList <Integer>> a,int vis[],int p[]){//bottom Up
		vis[r]=1;
		for(int i=0;i<a.get(r).size();i++){
			int v=a.get(r).get(i);
			if(vis[v]==0){
				p[v]=r;
				h[r]=Math.max(h[r], hieght(v, h, a, vis,p));
			}
		}
		return ++h[r];
	}
	public static void hieghtBfs(int r,int h[],ArrayList<ArrayList <Integer>> a,int p[],int vis[]){/// top to bottom
		Deque<Integer> q=new LinkedList<>();
		q.add(r);
		int c=1;
		p[r]=-1;
		vis[r]=1;
		while(q.size()>0){
			int l=q.size();
			while(l-->0){
				int v=q.remove();
				h[v]=c;
				for(int i=0;i<a.get(v).size();i++){
					int u=a.get(v).get(i);
					if(vis[u]==0){
						p[u]=v;
						vis[u]=1;
						q.add(u);
					}
				}
			}
			c++;
		}
	}
	public static void centerTree(ArrayList<ArrayList<Integer>> a){
		int n=a.size();
		int d[]=new int[n];
		int vis[]=new int[n];
		Deque<Integer> q= new LinkedList<>();
		for(int i=0;i<n;i++){
			d[i]=a.get(i).size();
			if(d[i]==1)
			{
				vis[i]=1;
				q.add(i);
				//d[i]=0;
			}
		}
		pw.println(Arrays.toString(d));
		//Deque<Integer> center=new LinkedList<>();
		int rc=0;
		while(q.size()>0){
			
			if(rc+q.size()==n)
			break;
			int l=q.size();
			while(l-->0){
				int v=q.remove();
				//pw.print(v+" ");
				rc++;
				for(int i=0;i<a.get(v).size();i++){
					int u=a.get(v).get(i);
					d[u]--;
					if(d[u]==1){
						q.add(u);
						//d[u]=0;
					}
				}
			}
			//pw.print("\n");
		}

		while(q.size()>0){
			pw.println(q.remove());
		}
		
	}
	public static int[] GetLps(String s){
		int n=s.length();
		int a[]=new int[n];
		int j=0;
		for(int i=1;i<n;i++){
			if(s.charAt(i)==s.charAt(j)){
				j++;
				a[i]=j;
			}
			else if(j>0){
				while(j>0&&s.charAt(i)!=s.charAt(j)){
					j=a[--j];
				}
				if(s.charAt(i)==s.charAt(j))
				a[i]=++j;
			}
		}
		//pw.println(Arrays.toString(a));

		return a;

	}
	public static void fun(int a[],int m,int n,int i,long c[],int t){
		if(n<0)
		return;
		
		
		
		if(m-a[n]==0){
			c[0]+=((long)a.length-i)*((long)n+1);
			c[0]%=998244353;
		}
		else if(m-a[n]>0){
			fun(a, m-a[n], n-1, i, c, t);
		}
		if(t==m)
		fun(a, m, n-1, i-1, c,t);
		else fun(a, m, n-1, i, c, t);
		
	}

	public static void main(String[] args) {
		// code starts..
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=scanArray(n);
		int dp[][]=new int [n][m+1];
		
		long k[]=new long[1];
		fun(a, m, n-1, n-1, k, m);
		//pw.println(c);
		pw.println(k[0]);

		// Code ends...
		pw.flush();
		pw.close();
	}
	public static Comparator<Integer> C(){
		return 
		new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);//for descending
			}
		};
	}
	static class tripletL implements Comparable<tripletL> {
		Long x, y, z;
 
		tripletL(long x, long y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
 
		public int compareTo(tripletL o) {
			int result = x.compareTo(o.x);
			if (result == 0)
				result = y.compareTo(o.y);
			if (result == 0)
				result = z.compareTo(o.z);
 
			return result;
		}
 
		public boolean equlas(Object o) {
			if (o instanceof tripletL) {
				tripletL p = (tripletL) o;
				return (x - p.x == 0) && (y - p.y ==0 ) && (z - p.z == 0);
			}
			return false;
		}
 
		public String toString() {
			return x + " " + y + " " + z;
		}
 
		public int hashCode() {
			return new Long(x).hashCode() * 31 + new Long(y).hashCode() + new Long(z).hashCode();
		}
	}
	public static String Doubleformate(double a,int n){
		String s="";
		while(n-->0){
			s+='0';
		}
		DecimalFormat f =new DecimalFormat("#0."+s);
		return f.format(a);
	}
 
	public static Comparator<Integer[]> column(int i){
		return 
		new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return o1[i].compareTo(o2[i]);//for ascending
				//return o2[i].compareTo(o1[i]);//for descending
			}
		};
	}
	public static Comparator<Integer[]> pair(){
		return 
		new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				int result=o1[0].compareTo(o2[0]);
				if(result==0)
				result=o1[1].compareTo(o2[1]);
				return result;
			}
		};
	}
	public static Comparator<Integer[]> Triplet(){
		return 
		new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
			
					for(int i=0;i<3;i++){
						for(int j=i+1;j<3;j++){
							for(int k=0;k<3;k++){
								for(int p=k+1;p<3;p++){
									if((o1[i]==o2[k]&&o1[j]==o2[p])||(o1[j]==o2[k]&&o1[i]==o2[p])){
 
									}
								}
							}
						}
					}
					int result=o1[0].compareTo(o2[0]);
					if(result==0)
					result=o1[1].compareTo(o2[1]);
					if(result==0)
					result=o1[2].compareTo(o2[2]);
					return result;
			}
		};
	}
	
	
	public static String reverseString(String s){
		StringBuilder input1 = new StringBuilder(); 
        input1.append(s);  
		input1 = input1.reverse();
		return input1.toString();
	}
	public static int[] scanArray(int n){
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
 
		return a;
	}
	public static long[] scanLongArray(int n){
		long a[]=new long [n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextLong();
 
		return a;
	}
	public static String [] scanStrings(int n){
		String a[]=new String [n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextLine();
 
		return a;
	}
	static class InputReader {
 
		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;
		private SpaceCharFilter filter;
 
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int snext() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public int nextInt() {
			int c = snext();
			while (isSpaceChar(c)) {
				c = snext();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public long nextLong() {
			int c = snext();
			while (isSpaceChar(c)) {
				c = snext();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}
 
		public String readString() {
			int c = snext();
			while (isSpaceChar(c)) {
				c = snext();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public String nextLine() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isEndOfLine(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
 
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
 
}

class Bit{//1...n
	int a[];
	Bit(int n){
		a=new int[n+1];
	}
	void update(int i,int delta){
		while(i<a.length){
			a[i]+=delta;
			i+=i&(-i);
		}
	}
	int query(int i){
		int sum=0;
		while(i>0){
			sum+=a[i];
			i-=i&(-i);
		}
		return sum;
	}
}
class Pair{
	int i,j;
	Pair(int i,int j){
		this.i=i;
		this.j=j;
	}
}
