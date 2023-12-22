import java.util.*;
import java.io.*;
public class Main  {
    public static void main(String args[]) {
      FastScanner fs=new FastScanner();    
      PrintWriter out=new PrintWriter(System.out);
      
      int n=fs.nextInt();
      long a[]=fs.readArray(n);
      long mod=(long)1e9+7;
      
      int i,j;
      long pro=1;
      long fp=0;
      for(i=0;i<n;i++)
      {
          for(j=i+1;j<n;j++)
          {
              pro=(a[i]*a[j])%mod;
              fp+=pro;
              fp%=mod;
          }
      }
      out.println(fp);
        
        out.flush();
        out.close();
    }
	static void ruffleSort(int[] a) {
 		Random random=new Random();
		int n=a.length;
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
}
        class FastScanner {
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
		String nextLine(){
		    String str="";
		    try{
		        str=br.readLine();
		    }catch(IOException e){
		        e.printStackTrace(); }
		    return str;
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long[] readArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}