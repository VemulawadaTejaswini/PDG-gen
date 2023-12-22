
import java.util.*;
import java.io.*;
import java.math.BigInteger; 
class Mamo {
    static long mod=1000000007;
    static Reader in=new Reader();
    static List<Integer >G[];
    static long a[],p[],xp[],xv[];
    static StringBuilder Sd=new StringBuilder(),Sl=new StringBuilder();
    public static void main(String [] args) {
    	//Dir by MohammedElkady
  int x=in.nextInt();
 if(x==0)x++;
 else x--;
 out.append(x+" ");
    	out.close();
    }
    
    static long ans=0L;
    static boolean v[];
    static ArrayList<Integer>res;
    static  Queue <Integer> pop;
    static  Stack <Integer>rem;
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    static long gcd(long g,long x){if(x<1)return g;else return gcd(x,g%x);}  
    static class Reader 
    { 
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public Reader() { this(System.in); }public Reader(InputStream is) { mIs = is;} 
        public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];} 
        public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;} 
        public String s(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();} 
        public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;} 
        public int nextInt(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;} 
        public double d() throws IOException {return Double.parseDouble(s()) ;}
        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; } 
        public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; } 
        public int[] arr(int n){int[] ret = new int[n];for (int i = 0; i < n; i++) {ret[i] = nextInt();}return ret;}
    }
}

class stree{
	public stree(int n,long a[]) {
		this.a=a;
		seg=new long[n*4];
		lazy=new long[n*4];
		build(1,0,n-1);
	}
	long seg[], a[],lazy[];
	    void check(int p,int s,int e) {
	        if(lazy[p]!=0) {
	            seg[p] += lazy[p];
	            if(s!=e) {
	                lazy[2*p] += lazy[p];
	                lazy[2*p+1] += lazy[p];
	            }
	            lazy[p] = 0;
	        }
	    }
	    
	     void build(int p,int s,int e) {
	        check(p,s,e);
	        
	        if(s==e) {
	            seg[p] = a[s];
	            return;
	        }
	        
	        build(2*p,s,(s+e)/2);
	        build(2*p+1,(s+e)/2+1,e);
	        
	        seg[p] = Math.max(seg[2*p], seg[2*p+1]);
	    }
	    
	   void update(int p,int s,int e,int i,int v) {
	        check(p,s,e);
	        
	        if(s==e) {
	            seg[p] = v;
	            return;
	        }
	        
	        if(i<=(s+e)/2) update(2*p,s,(s+e)/2,i,v);
	        else update(2*p+1,(s+e)/2+1,e,i,v);
	        
	        seg[p] = Math.max(seg[2*p],seg[2*p+1]);
	    }
	    
	     void update(int p,int s,int e,int a,int b,int v) {
	        check(p,s,e);
	        
	        if(s>=a && e<=b) {
	            seg[p] += v;
	            
	            if(s!=e) {
	                lazy[2*p] += v;
	                lazy[2*p+1] += v;
	            }
	            
	            return;
	        }
	        
	        if(s>b || e<a)
	            return;
	        
	        update(2*p,s,(s+e)/2,a,b,v);
	        update(2*p+1,(s+e)/2+1,e,a,b,v);
	        
	        seg[p] = Math.max(seg[2*p],seg[2*p+1]);
	    }
    
 
    
    long get(int p,int s,int e,int a,int b) {
        if(s>=a && e<=b)
            return seg[p];
        
        if(s>b || e<a)
            return Long.MIN_VALUE; 
        
        return Math.max(get(2*p,s,(s+e)/2,a,b), get(2*p+1,(s+e)/2+1,e,a,b));
    }
}
class node implements Comparable<node>{
int a, b;
node(int tt,int ll){
a=tt;b=ll;
}
    @Override
    public int compareTo(node o) {
    return b-o.b;    
    }
}
class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
}
 
class Sorting{
 
 public static long[] bucketSort(long[] array, int bucketCount) {
 
 if (bucketCount <= 0) throw new IllegalArgumentException("Invalid bucket count");
 
 if (array.length <= 1) return array; //trivially sorted
 
 
 
 long high = array[0];
 
 long low = array[0];
 
 for (int i = 1; i < array.length; i++) { //find the range of input elements
 
 if (array[i] > high) high = array[i];
 
 if (array[i] < low) low = array[i];
 
 }
 
 double interval = ((double)(high - low + 1))/bucketCount; //range of one bucket
 
 
 ArrayList<Long> buckets[] = new ArrayList[bucketCount];
 
 for (int i = 0; i < bucketCount; i++) { //initialize buckets
 
 buckets[i] = new ArrayList();
 
 }
 
 
 
 for (int i = 0; i < array.length; i++) { //partition the input array
 
 buckets[(int)((array[i] - low)/interval)].add(array[i]);
 
 }
 
 
 int pointer = 0;
 
 for (int i = 0; i < buckets.length; i++) {
 
 Collections.sort(buckets[i]); //mergeSort
 
 for (int j = 0; j < buckets[i].size(); j++) { //merge the buckets
 
 array[pointer] = buckets[i].get(j);
 
 pointer++;
 
 }
 
}
 
return array;
 
}
}