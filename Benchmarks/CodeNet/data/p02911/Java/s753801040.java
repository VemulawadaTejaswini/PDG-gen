import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, k;
		
      StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
      	k = Integer.parseInt(st.nextToken());
      	int q = Integer.parseInt(st.nextToken());
      	
      if(k>q)
        	for(i=1;i<=n;i++)
              out.println("Yes");
      else
      { 
      int[] ar = new int[n+1];
     int max=Integer.MIN_VALUE;
        
      for(int j=1;j<=q;j++)
      {
        int tmp=Integer.parseInt(br.readLine());
        ar[tmp]++;
        max=Math.max(max,ar[tmp]);
      }
      for(i=1;i<=n;i++)
      {
        if(ar[i]==max)
          out.println("Yes");
        else
          out.println("No");
      }
     }
	out.flush();
	out.close();
	}
}