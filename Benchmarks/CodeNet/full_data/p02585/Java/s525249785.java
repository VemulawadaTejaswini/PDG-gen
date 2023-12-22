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

    static void solve(FastScanner in,PrintWriter out){
     int n=in.nextInt(); int k=in.nextInt();
     int p[]=new int[n];
     long mx=Long.MIN_VALUE;
     for(int i=0;i<n;i++) p[i]=in.nextInt()-1;
     long a[]=new long[n]; for(int i=0;i<n;i++) { a[i]=in.nextLong(); mx=Math.max(mx,a[i]); }
     long ans=Long.MIN_VALUE;
     for(int i=0;i<n;i++){
         long count=0,max=Long.MIN_VALUE;
         int pos=i,cnt=0;
         long sum[]=new long[n+1]; sum[0]=0;
         TreeSet<Integer> t=new TreeSet<>(); t.add(0);
         while(cnt<k){
             cnt++;
             pos=p[pos];
             count+=a[pos];
             if(max<=count) { max=count; t.add(cnt);  }
             sum[cnt]=count;
             if(pos==i) break;
         }
         if(count<0) { ans=Math.max(ans,max); continue; }
         int kk=k;
         long temp=(kk/cnt)*count;
         kk-=(kk/cnt)*cnt;
         temp+=sum[t.floor(kk)];
         max=Math.max(max,temp);
         ans=Math.max(ans,max);
     }
     out.println(Math.max(mx,ans));
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
