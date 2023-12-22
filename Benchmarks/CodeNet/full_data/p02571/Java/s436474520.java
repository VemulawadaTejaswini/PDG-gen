import java.util.*;
import java.io.*;
public class Main  {
    public static void main(String args[]) {
      FastScanner fs=new FastScanner();    
      PrintWriter out=new PrintWriter(System.out);
      String s=fs.next();
      String t=fs.next();
      int l1=s.length();
      int l2=t.length();
      
      int i,j;
      char ch;
      int min=0;
      String sub;
      if(l1==l2)
      {
          for(i=0;i<l1;i++)
          {
              if(s.charAt(i)!=t.charAt(i))
              min++;
          }
      }
      else
      {min=l2;
      for(i=0;i<l1-l2;i++)
      {
        sub=s.substring(i,i+l2);
        int c=0;
        for(j=0;j<l2;j++)
        {
            if(sub.charAt(j)!=t.charAt(j))
            c++;
        }
        if(c<min)
        min=c;
      }
      }
      out.println(min);
        
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