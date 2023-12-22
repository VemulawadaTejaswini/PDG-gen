import java.util.*;
import java.io.*;
public class Main  {
    static int gcd(int m,int n)
    {
        if(n==0)
        return m;
        else
        return gcd(n,m%n);
    }
    public static void main(String args[]) {
      FastScanner fs=new FastScanner();    
      PrintWriter out=new PrintWriter(System.out);
        
        int n=fs.nextInt();
        int a[]=fs.readArray(n);
        
        int i;
        int sg=gcd(a[0],a[1]);
        for(i=2;i<n;i++)
        {
            sg=gcd(sg,a[i]);
        }
        if(sg!=1)
        {
            out.println("not coprime");
        }
        else
        {
            int j;
            int flag=1;
            outer: for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i!=j && gcd(a[i],a[j])!=1)
                    {
                        flag=0;
                        break outer;
                    }
                }
            }
            if(flag==1)
            out.println("pairwise coprime");
            else
            out.println("setwise coprime");
        }
        
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
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}