import java.util.*;
import java.math.*;
import java.io.*;
class Main{
	public static InputReader sc;
    public static PrintWriter out;
    public static final long MOD = (long)1e9 + 7L;
    public static void main(String[] args){
    	sc=new InputReader(System.in);	
    	out=new PrintWriter(System.out);
    	int n=sc.nextInt();
    	ArrayList<Pair> l=new ArrayList<Pair>();
    	for(int i=0;i<n;i++){
    		int u=sc.nextInt();
    		int v=sc.nextInt();
    		l.add(new Pair(i,u,v));
    	}
    	Collections.sort(l, Pair.ValX);
    	PriorityQueue<Edge> q=new PriorityQueue<Edge>(new Comparator<Edge>(){
    		public int compare(Edge e1,Edge e2){
    			return e1.dis-e2.dis;
    		}
    	});
    	for(int i=0;i<l.size()-1;i++){
    		q.add(new Edge(l.get(i).index,l.get(i+1).index,Math.min(Math.abs(l.get(i).x-l.get(i+1).x),Math.abs(l.get(i).y-l.get(i+1).y))));
    	}
    	Collections.sort(l,Pair.ValY);
    	for(int i=0;i<l.size()-1;i++){
    		q.add(new Edge(l.get(i).index,l.get(i+1).index,Math.min(Math.abs(l.get(i).x-l.get(i+1).x),Math.abs(l.get(i).y-l.get(i+1).y))));
    	}
    	DisjointSet dis=new DisjointSet(n);
    	int ans=0;
    	while(!q.isEmpty()){
    		Edge e=q.poll();
    		if(dis.parent(e.u)!=dis.parent(e.v)){
    			dis.union(e.u, e.v);
    			ans+=e.dis;
    		}
    	}
    	out.println(ans);
    	out.close();
    }
    static class Edge{
    	int u;
    	int v;
    	int dis;
    	Edge(int u,int v,int dis){
    		this.u=u;
    		this.v=v;
    		this.dis=dis;
    	}
    }
   static class Pair{
	   int index;
	   int x;
	   int y;
	   Pair(int index,int x,int y){
		   this.x=x;
		   this.y=y;
		   this.index=index;
	   }
	   public static Comparator<Pair> ValX=new Comparator<Pair>(){
  		public int compare(Pair p1,Pair p2){
   			return p1.x-p2.x;
   		}
   		};
   		public static Comparator<Pair> ValY=new Comparator<Pair>(){
   			public int compare(Pair p1,Pair p2){
   				return p1.y-p2.y;
   			}
   		};
   }
//    static class Pair{
//    	String x;
//    	int y;
//    	Pair(){
//    		this.x="";
//    		this.y=-1;
//    	}
//    	Pair(String profit,int val,int count){
//    		this.x=profit;
//    		this.y=val;
//    	}
//    	public static Comparator<Pair> Val=new Comparator<Pair>(){
//    		public int compare(Pair p1,Pair p2){
//    			if(p1.x==p2.y){
//    				return p1.y-p2.y;
//    			}
//    			return (int)p1.x-(int)p2.x;
//    		}
//    	};
//    	public int hashCode() {
//    		final int prime = 31;
//    		int result = 1;
//    		result = prime * result + x;
//    		result = prime * result + x;
//    		return result;
//    	}
//    	public boolean equals(Object obj){
//    		if (this == obj)
//    	        return true;
//    	    if (!(obj instanceof Pair)) {
//    	        return false;
//    	    }
//    	 
//    	    Pair p = (Pair) obj;
//    	    if(p.x!=this.x){
//    	    	return false;
//    	    }
//    	    else if(p.y!=p.y){
//    	    	return false;
//    	    }
//    	    return true;
//    	}
//    }
    static class DisjointSet{
    	int n;
    	int[] par;
    	int[] rank;
    	DisjointSet(int n){
    		this.n=n;
    		this.par=new int[n];
    		this.rank=new int[n];
    		makeSet();
    	}
    	void makeSet(){
    		for(int i=0;i<n;i++){
    			par[i]=i;
    			rank[i]=1;
    		}
    	}
    	void union(int x,int y){
    		int parX=parent(x);
    		int parY=parent(y);
    		if(parX!=parY){
    			if(rank[parX]>=rank[parY]){
    				rank[parX]+=rank[parY];
    				rank[parY]=0;
    				par[parY]=parX;
    			}
    			else{
    				rank[parY]+=rank[parX];
    				rank[parX]=0;
    				par[parX]=parY;
    			}
    		}
    	}
    	int parent(int c){
    		int i=c;
    		while(i!=par[i]){
    			i=par[i];
    		}
    		return i;
    	}
    }
    static int gcd(int a,int b){
    	if(b==0){
    		return a;
    	}
    	return gcd(b,a%b);
    	
    }
    static int lcm(int a,int b){
    	int g;
    	if(a<b){
    		g=gcd(b,a);
    	}
    	else{
    		g=gcd(a,b);
    	}
    	return (a*b)/g;
    }
    static long bigmod ( long a, long p, long m ) {
        long res = 1 % m, x = a % m;
        while ( p>0 ) {
            if ( (p & 1)==1 ) res = ( res * x ) % m;
            x = ( x * x ) % m; p >>= 1;
        }
        return res;
    }
    static boolean isPrime(int n){
    	 if (n == 2)
    	        return true;
    	    for (long i = 2; i * i <= n; i++) {
    	        if (n % i == 0)
    	            return false;
    	    }
    	    return true;
    }
    
    static void shuffle(int[] A){
    	for(int i=A.length-1;i>0;i--){
    		int j=(int)(Math.random()*(i+1));
    		int temp=A[j];
    		A[j]=A[i];
    		A[i]=temp;
    	}
    }
    
//	public static class Node implements Comparable<Node>{
//	    int u;
//	    int v;
//	    public Node(){
//	    	;
//	    }
//	    public Node (int u, int v) {
//	    	this.u = u;
//	        this.v = v;
//	    }
//	    
//	    public void print() {
//	        out.println(v + " " + u + " ");
//	    }
//	   
//	    public int compareTo(Node n1){
//	    	return this.u-n1.u;
//	    }
//	}
	public static long pow(long base,long exp,long mod){
		if(exp==0){
			return 1;
		}
		if(exp==1){
			return base;
		}
		long temp=exp/2;
		long val=pow(base,temp,mod);
		long result=val*val;
		result=(result%mod);
		long AND=exp&1;
		if(AND==1){
			result*=base;
			result=(result%mod);
		}
		return result;
	}
	public static BigInteger pow(BigInteger base, BigInteger exp) {
	    if(exp.equals(new BigInteger(String.valueOf(0)))){
	        return new BigInteger(String.valueOf(1));
	    }    
	    if(exp.equals(new BigInteger(String.valueOf(1))))
	        return base;
	    BigInteger temp=exp.divide(new BigInteger(String.valueOf(2)));
	    BigInteger val = pow(base, temp);
	    BigInteger result = val.multiply(val);
	    result=result.remainder(new BigInteger(String.valueOf(MOD)));
	    BigInteger AND=exp.and(new BigInteger(String.valueOf(1)));
	    if(AND.equals(new BigInteger(String.valueOf(1)))){
	        result = result.multiply(base);
	        result=result.remainder(new BigInteger(String.valueOf(MOD)));
	    }    
	    return result;
	}
	    
	static class InputReader {

	    private InputStream stream;
	    private byte[] buf = new byte[8192];
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
	        while (isSpaceChar(c))
	            c = snext();
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
	        while (isSpaceChar(c))
	            c = snext();
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
	        for (int i = 0; i < n; i++)
	            a[i] = nextInt();
	        return a;
	    }

	    public String readString() {
	        int c = snext();
	        while (isSpaceChar(c))
	            c = snext();
	        StringBuilder res = new StringBuilder();
	        do {
	            res.appendCodePoint(c);
	            c = snext();
	        } while (!isSpaceChar(c));
	        return res.toString();
	    }

	    public boolean isSpaceChar(int c) {
	        if (filter != null)
	            return filter.isSpaceChar(c);
	        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	    }

	    public interface SpaceCharFilter {
	        public boolean isSpaceChar(int ch);
	    }
	}

}

