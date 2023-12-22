import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int[] a = new int[n];
      for(int i = 0; i < n; i++)
    	  a[i] = Integer.parseInt(st.nextToken());
      StringJoiner sj = new StringJoiner(" ");
      if(k > Math.log(n)+1) {
    	  for(int i = 0; i < n; i++)
    		  sj.add(Integer.toString(n));
      }
      else {
    	  for(int i = 0; i < k; i++) {
    		  int[] b = new int[n];
    		  for(int j = 0; j < n; j++) {
    			  b[Math.max(0,j - a[j])]++;
    			  if(j + a[j] < n-1)
    				  b[j + a[j]+1]--;
    		  }
    		  for(int j = 1; j < n; j++) {
    			  b[j] += b[j-1];
    		  }
    		  a = b;
    	  }
    	  for(int i = 0; i < n; i++)
    		  sj.add(Integer.toString(a[i]));
      }
      out.println(sj);
      out.close();
   }
}