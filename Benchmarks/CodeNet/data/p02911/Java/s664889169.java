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
      	
        HashMap<Integer,Integer> hp = new HashMap<>();
        
     int max=Integer.MIN_VALUE;
        
      for(int j=1;j<=q;j++)
      {
        int tmp=Integer.parseInt(br.readLine());
        if(!hp.containsKey(tmp))
          	hp.put(tmp,1);
        else
          	hp.put(tmp,hp.get(tmp)+1);
      }
      for(i=1;i<=n;i++)
      {
        if(hp.containsKey(i) && k-(q-hp.get(i))>0)
          out.println("Yes");
        else
        if(k-q>0)
          out.println("Yes");
        else
          out.println("No");
      }
	out.flush();
	out.close();
	}
}