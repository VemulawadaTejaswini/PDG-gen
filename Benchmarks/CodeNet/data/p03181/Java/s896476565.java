import java.io.*;
import java.io.IOException;
import java.lang.Thread.State;
import java.util.*;
//import javafx.util.Pair; 
//import java.util.concurrent.LinkedBlockingDeque;




    
  public class Main {
        
        public static long mod = (long)Math.pow(10, 9)+7 ;
        public static double epsilon=0.00000000008854;//value of epsilon
        public static InputReader sc = new InputReader(System.in);
        public static PrintWriter pw = new PrintWriter(System.out);
        
        public static ArrayList<ArrayList <Integer>> GetGraph(int n,int m){
            ArrayList<ArrayList <Integer>> g=new ArrayList<>();
            for(int i=0;i<n;i++){
                g.add(new ArrayList<>());
            }
            for(int i=0;i<m;i++){
                //int t=sc.nextInt();
                int u=sc.nextInt()-1;
                int v=sc.nextInt()-1;
                g.get(u).add(v);
                //if(t==0)
                g.get(v).add(u);
            }
            return g;
        }
        
        public static int find(int a,int p[]){
            if(a!=p[a]){
               p[a]=find(p[a], p);
            }
             return p[a];
        }
        public static void Union(int a,int b,int p[]){
            p[find(b, p)]=find(a, p);
        }
        public static long gcd(long a,long b){
            while(b>0){
                long t=b;
                b=a%b;
                a=t;
            }
            return a;
        }
        public static void dfs(ArrayList<ArrayList <Integer>> g,long val[],int u,int vis[],long m,int p[]){
            vis[u]=1;
            //boolean f=false;
            val[u]=1;
            for(int i=0;i<g.get(u).size();i++){
                int v=g.get(u).get(i);
                if(vis[v]==0){
                    p[v]=u;
                    dfs(g, val, v, vis,m,p);
                    val[u]*=(val[v]+1);
                    val[u]%=m;
                }
                
            }
            vis[u]=2;
        }
        public static void dfs1(ArrayList<ArrayList <Integer>> g,long val[],int u,int p[],long m,long ans[],long up[]){
           // vis[u]=1;
            //boolean f=false;
            ans[u]=val[u];
            long k=1;
            if(p[u]!=-1){
                for(int i=0;i<g.get(p[u]).size();i++){
                    int v=g.get(p[u]).get(i);
                    if(v==u){
                        continue;
                    }
                    if(v==p[p[u]]){
                        k*=(up[p[u]]+1);
                        k%=m;;
                        continue;
                    }
                    k*=(val[v]+1);
                    k%=m;;
                }
                up[u]=k;
                ans[u]*=(k+1);
                ans[u]%=m;
            }
            for(int i=0;i<g.get(u).size();i++){
                int v=g.get(u).get(i);
                if(v!=p[u]){
                    dfs1(g, val, v, p, m, ans, up);
                }
                
            }
        }
        
    public static long modu(long p,long mod){
        if(p>=mod){
             p=-mod;
        }
        return p;
    }
    public static long pow(long x,long y,long mod){
		long ans=1;
		while(y>0){
			if((y&1)==1){
				ans=(ans*x)%mod;
			}
			y=y>>1;
			x=(x*x)%mod;
		}
		return ans;
    } 
	 public static void rec(int mask,int i,ArrayList<Integer> not,int groupmask,long val[],long dp[]){
        if(i==not.size()){
            dp[(mask|groupmask)]=Math.max(dp[(mask|groupmask)], dp[mask]+val[groupmask]);
            return;
        }
        rec(mask, i+1, not, groupmask, val, dp);
        rec(mask, i+1, not, groupmask|(1<<not.get(i)), val, dp);
     }
        public static void main(String[] args) {
            // code starts..
           int n=sc.nextInt();
           int m=sc.nextInt();
           ArrayList<ArrayList<Integer>> g=GetGraph(n, n-1);
           long val[]=new long[n];
           int p[]=new int[n];
           p[0]=-1;
           long ans[]=new long [n];
           long up[]=new long[n];
           dfs(g, val, 0, new int[n], m, p);
           dfs1(g, val, 0, p, m, ans, up);
           for(int i=0;i<n;i++){
               pw.println(ans[i]);
           }
                         
            // Code ends...
            pw.flush();
            pw.close();
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
        public static Comparator<Pair> C(){
            return 
            new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o2.le-o1.le;//for des
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
        
    }
    
    class InputReader {
    
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
        class Pair{
            int le;
            int p;
            Pair(int leaves,int parent){
                le=leaves;
                p=parent;
            }
        }
        
        
        