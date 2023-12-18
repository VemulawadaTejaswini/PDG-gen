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
		boolean start=false,end=false;
		int startIndex=-1;
		for(int i=0;i<n;i++) {
			if(s[i].charAt(0)==')') {
				start=true;
				startIndex=i;
				break;
			}
		}
		if(!start) {
			out.println("No");
			//out.println("No start");
		}else {
			for(int i=0;i<n;i++) {
				if(i==startIndex)
					continue;
				if(s[i].charAt(s[i].length()-1)==')') {
					end=true;
					break;
				}
			}
			if(end) {
				int a[]=new int[n];
				int tot=0;
				for(int i=0;i<n;i++) {
					int count=0,minCount=s[i].length();
					for(int j=0;j<s[i].length();j++) {
						if(s[i].charAt(j)==')'){
							count--;
						}else {
							count++;
						}
						if(s[i].charAt(j)==')')
							minCount=Math.min(minCount, count)	;
					}
					a[i]=minCount;
					tot+=count;
				}
				if(tot!=0) {
					out.println("No");
					//out.println("tot not 0");
				}else {
					int sum=0;
					Arrays.sort(a);
					for(int i=n-1;i>=0;i--) {
						sum+=a[i];
						if(sum<0) {
							out.println("No");
							return;
						}
					}
					
					out.println("Yes");
					
				}
			}else {
				out.println("No");
				//out.println("No end");
			}
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
