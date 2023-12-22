import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      long n = Long.parseLong(st.nextToken());
     st = new StringTokenizer(br.readLine());
     long prod = 1;
     boolean fail;
      for(int i = 0; i < n; i++){
        long next = Long.parseLong(st.nextToken());
        if(Math.pow(10,18)/prod < next){
          fail = true;
          break;
        }
        prod *= next;
      }
     if(fail)
       out.println(-1);
     else
       out.println(prod);
      out.close();
   }
}
