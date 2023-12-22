// No sorceries shall prevail. //           
import java.util.*;
import java.io.*;
public class Main {
	//Variables
	static long mod = 1000000007;
	static long mod2 = 998244353;
	static FastReader inp= new FastReader();
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}
	
	//Main
	void main() {
		
		int n=inp.nextInt();
		String s[]=new String[n];
		input(s,n);
		StringBuilder sb= new StringBuilder("");
		Pair pos[]=new Pair[n];
		Pair neg[]=new Pair[n];
		int posIndex=0,negIndex=0;
		for(int i=0;i<n;i++) {
			int count=0,min=s[i].length();
			for(int j=0;j<s[i].length();j++){
				if(s[i].charAt(j)=='(') {
					count++;
				}else {
					count--;
				}
				min=Math.min(count, min);
			}
			if(min<0) {
				if(count>0) {
					pos[posIndex++]=new Pair(min,i);
				}else {
					neg[negIndex++]=new Pair(min-count,i);	
				}
			}else {
				sb.append(s[i]);
			}
		}
		Arrays.sort(pos,0,posIndex);
		Arrays.sort(neg,0,negIndex);
		for(int i=0;i<posIndex;i++) {
			sb.append(s[pos[i].r]);
		}
		for(int i=negIndex-1;i>=0;i--) {
			sb.append(s[neg[i].r]);
		}
		int count=0;
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='(') {
				count++;
			}else {
				count--;
			}
			if(count<0) {
				out.println("No");
				return;
			}
		}
		out.println(count==0?"Yes":"No");
	}
	
	static class Pair implements Comparable<Pair> {
		int l,r;
		Pair(int l, int r){
			this.l=l;
			this.r=r;
		}
		
		@Override
		public int compareTo(Pair e) {
			return (l-e.l)!=0?l-e.l:r-e.r;
		}
	}
	
	
	
	
	
	
	
	
	
	// Classes
	static class Edge implements Comparable<Edge>{
		int l,r;
		Edge(){}
		Edge(int l,int r){
			this.l=l;
			this.r=r;
		}
		@Override
		public int compareTo(Edge e) {
			return (l-e.l)!=0?l-e.l:r-e.r;
		}
	}
	
    static class Segment implements Comparable<Segment> {
		long l, r, initialIndex;
		Segment () {}
		Segment (long l_, long r_, long d_) {
		    this.l = l_;
		    this.r = r_;
		    this.initialIndex = d_;
		}
		@Override
		public int compareTo(Segment o) {
		    return (int)((l - o.l) !=0 ? l-o.l : initialIndex - o.initialIndex);
		}
    }
    
    static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
        String next() { 
            while (st==null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
        String nextLine() { 
            String s=""; 
            try { 
                s=br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return s; 
        } 
    } 
    
    // Functions
	static long gcd(long a, long b) { 
		return b==0?a:gcd(b,a%b);
	}
	static int gcd(int a, int b) { 
		return b==0?a:gcd(b,a%b);
	}
	
	void reverse(long[] A,int l,int r) {
        int i=l,j=r-1;
        while(i<j) {
            long t=A[i];
            A[i]=A[j];
            A[j]=t;
            i++;j--;
        }
    }
    void reverse(int[] A,int l,int r) {
        int i=l,j=r-1;
        while(i<j) {
            int t=A[i];
            A[i]=A[j];
            A[j]=t;
            i++;j--;
        }
    }
    
    //Input Arrays
    static void input(long a[], int n) {
		for(int i=0;i<n;i++) {
			a[i]=inp.nextLong();
		}
	}
	static void input(int a[], int n) {
		for(int i=0;i<n;i++) {
			a[i]=inp.nextInt();
		}
	}	
	static void input(String s[],int n) {
		for(int i=0;i<n;i++) {
			s[i]=inp.next();
		}
	}
	static void input(int a[][], int n, int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=inp.nextInt();
			}
		}
	}
	static void input(long a[][], int n, int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=inp.nextLong();
			}
		}
	}
		
}
