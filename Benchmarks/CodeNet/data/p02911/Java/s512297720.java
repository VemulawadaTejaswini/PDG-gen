import java.io.*;
import java.util.*;

public class Main {
  static String[] r = {"Sunny","Cloudy","Rainy"};
  	public static int ncr(String str)
    {
      if(str.equalsIgnoreCase("Sunny"))
        return 0;
      if(str.equalsIgnoreCase("Cloudy"))
        return 1;
      if(str.equalsIgnoreCase("Rainy"))
        return 2;
      return -1;
    }
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, k;
		
      StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
      	k = Integer.parseInt(st.nextToken());
      	int q = Integer.parseInt(st.nextToken());
      	
      int[] ar = new int[n+1];
        for(i=1;i<=n;i++)
        {
          ar[i]=k;
        }
      for(int j=1;j<=q;j++)
      {
        int tmp=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
          if(tmp==i)
            continue;
          ar[i]-=1;
        }
      }
      
      for(i=1;i<=n;i++)
      {
        if(ar[i]>0)
          out.println("Yes");
        else
          out.println("No");
      }
	out.flush();
	out.close();
	}
}