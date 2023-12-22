import java.util.*;
import java.io.*;
public class Main  {
    public static void main(String args[]) {
      FastScanner fs=new FastScanner();    
      PrintWriter out=new PrintWriter(System.out);
        
        int n=fs.nextInt();
        
        Integer a[][]=new Integer[n][2];
        
        for(int i=0;i<n;i++)
        {
            a[i][0]=fs.nextInt();
            a[i][1]=fs.nextInt();
        }
        
        Arrays.sort(a,(ar,b)->(ar[0]-b[0]));
        
        long max=Long.MIN_VALUE;
        
        for(int i=1;i<n-1;i++)
        {
            if(check(a[i-1][1],a[i][1],a[i+1][1]))
            {
                long tp1=(long)Math.abs(a[i-1][0]-a[i][0])+(long)Math.abs(a[i-1][1]-a[i][1]);
                long tp2=(long)Math.abs(a[i+1][0]-a[i][0])+(long)Math.abs(a[i+1][1]-a[i][1]);
                
                max=Math.max(tp1,tp2);
            }
        }
        
        long p1=(long)Math.abs(a[0][0]-a[1][0])+(long)Math.abs(a[0][1]-a[1][1]);
        
        long p2=(long)Math.abs(a[n-1][0]-a[n-2][0])+(long)Math.abs(a[n-1][1]-a[n-2][1]);
        
        max=Math.max(max,Math.max(p1,p2));
        
        
        out.println(max);
        out.flush();
        out.close();
    }
    
    static boolean check(int a,int b,int c)
    {
        if(b>a && b>c)
        return true;
        else
        return false;
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
	}