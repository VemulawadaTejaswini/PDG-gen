import java.util.*;
import java.io.*;
public class Main  {
    public static void main(String args[]) {
      FastScanner fs=new FastScanner();    
      PrintWriter out=new PrintWriter(System.out);
      
      int n=fs.nextInt();
      int k=fs.nextInt();
      int a[]=fs.readArray(n);
      int i;
      ArrayList<Integer> al=new ArrayList<>();
      
      for(i=0;i<n;i++)
      {
          int diff=Math.abs(a[i]-a[i+1]);
          if(diff<=k)
          {
              al.add(a[i]);
              al.add(a[i+1]);
              break;
          }
      }
      int curr=al.size()-1;
      for(i=i+2;i<n;i++)
      {
          if(Math.abs(al.get(curr)-a[i])<=k)
          {
              al.add(a[i]);
              curr=al.size()-1;
          }
      }
      out.println(al.size());
      
      
        
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
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		String nextLine() {
		    String str="";
		    try {
		        str=br.readLine();
		    }
		    catch (IOException e) {
		        e.printStackTrace(); 
		    }
		    return str;
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		double nextDouble() {
		    return Double.parseDouble(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long[] readLongArray(int n) {
		    long[] a=new long[n];
		    for(int i=0;i<n;i++) a[i]=nextLong();
		    return a;
		}
	}