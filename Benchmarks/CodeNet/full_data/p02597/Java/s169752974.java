import java.util.*;
import java.io.*;
public class template1{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      str = br.readLine();
      int numR = 0
      for(int i = 0; i < n; i++)
        	if(str.charAt(i) == 'R')
              numR++;
     int ans = 0;
     for(int i = 0; i < numR; i++)
       if(str.charAt(i) == 'W')
         ans++;
     out.println(ans);
      out.close();
   }
}