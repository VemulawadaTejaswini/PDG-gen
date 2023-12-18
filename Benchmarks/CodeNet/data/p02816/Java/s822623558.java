import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      int[] a = new int[n];
      int[] b = new int[n];
      int[] axor = new int[2*n];
      int[] bxor = new int[n];
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(st.nextToken());
          if(i > 0)
        	  axor[i] = a[i] ^ a[i-1];
      }
      axor[0] = a[0] ^  a[n-1];
      for(int i = 0; i < n; i++) {
    	  axor[i+n] = axor[i];
      }
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++) {
          b[i] = Integer.parseInt(st.nextToken());
          if(i > 0)
        	  bxor[i] = b[i] ^ b[i-1];
      }
      bxor[0] = b[0] ^ b[n-1];
      if(n != 1) {
	      HashSet<Integer> shift = new HashSet<Integer>();
	      int[] lps = new int[n];
	      int len = 0;
	      int i = 1;
	      while(i < n) {
	    	  if(bxor[len] == bxor[i]) {
	    		  len++;
	    		  lps[i] = len;
	    		  i++;
	    	  }
	    	  else {
	    		  if(len == 0) {
	    			  lps[i] = 0;
	    			  i++;
	    		  }
	    		  else
	    			  len = lps[len-1];
	    	  }
	      }
	      i = 0;
	      int j = 0;
	      while(i < 2*n-1) {
	    	  if(axor[i] == bxor[j]) {
	    		  if(j == n-1) {
	    			  shift.add(i-j);
	    			  j = lps[j];
	    		  }
	    		  else
	    			  j++;
	    		  i++;
	    	  }
	    	  else {
	    		  if(j != 0) {
	    			  j = lps[j-1];
	    		  }
	    		  else
	    			  i++;
	    	  }
	      }
	      for(int k: shift) {
	    	  out.println(k + " " + (a[k]^b[0]));
	      }
      }
      else
    	  out.println(0 + " " + (a[0] ^ b[0]));
      out.close();
   }
}