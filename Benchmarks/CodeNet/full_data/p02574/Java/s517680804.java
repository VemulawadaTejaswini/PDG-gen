import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		FastScanner in=new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
	//	int t=in.nextInt();
	//	while(t-->0)
		solve(in,out);
		out.close();
	}
	static int flag=0;
   static HashSet<Integer> h;
    static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    static void seive(int n){
        boolean prime[]=new boolean[n+1]; Arrays.fill(prime,true);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(prime[i]){
                int c=0; if(h.contains(i)) c++;
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                    if(h.contains(j)) c++;
                }
                if(c>1) flag=1;
            }
        }
    }
    static void solve(FastScanner in,PrintWriter out){
     int n=in.nextInt(); 
     int g=0;
     h=new HashSet<Integer>(); for(int i=0;i<n;i++){ g=in.nextInt(); h.add(g); }
     seive(1000000);
     if(flag==0){
         out.println("pairwise coprime");
     }
     else{
         for(int i:h){
             g=gcd(g,i);
         }
         if(g==1) out.println("setwise coprime"); else out.println("not coprime");
     }
    }    
	


	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
