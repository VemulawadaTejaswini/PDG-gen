
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)  throws IOException,NumberFormatException{
		try {
		FastScanner sc=new FastScanner();
		int x=sc.nextInt(),y=sc.nextInt();
		String a="1 3 5 7 8 10 12";
		String b="4 6 9 11";
		String c="2";
		boolean ans=false;
		if(a.contains(String.valueOf(x))&&a.contains(String.valueOf(y)))ans=true;
		if(b.contains(String.valueOf(x))&&b.contains(String.valueOf(y)))ans=true;
		if(c.contains(String.valueOf(x))&&c.contains(String.valueOf(y)))ans=true;
		
		System.out.println(ans?"Yes":"No");
		
		}
		catch(Exception e) {
			return ;
		}
		
	}
	static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int oi=random.nextInt(n),temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	public static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
                                      st=new StringTokenizer(br.readLine());				               
                              } catch (IOException e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
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
			for(int i=0; i<n ; i++) a[i]=nextLong();
			return a;
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

}
