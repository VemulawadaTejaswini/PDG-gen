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
      int[] axor = new int[n];
      int[] bxor = new int[n];
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(st.nextToken());
          if(i > 0)
        	  axor[i] = a[i] ^ a[i-1];
      }
      axor[0] = a[0] ^  a[n-1];
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++) {
          b[i] = Integer.parseInt(st.nextToken());
          if(i > 0)
        	  bxor[i] = b[i] ^ b[i-1];
      }
      bxor[0] = b[0] ^ b[n-1];
      /*HashMap<Integer,Integer> bad = new HashMap<Integer,Integer>();
      HashMap<Integer,Integer> revbad = new HashMap<Integer,Integer>();
      HashSet<Integer> cyc = new HashSet<Integer>();
      for(int i = 1; i < n; i++) {
    	  if(a[i] == a[0]) {
    		  if(bad.keySet().contains(i)) {
    			  int l = bad.get(i);
    			  bad.remove(i);
    			  bad.put(i+l,l);
    			  revbad.put(l,i+l);
    		  }
    		  else {
    			  cyc.add(i);
    			  bad.put(2*i,i);
    			  revbad.put(i,2*i);
    		  }
    	  }
    	  HashSet<Integer> rem = new HashSet<Integer>();
    	  for(int j: cyc) {
    		  if(a[i] != a[i-j]) {
    			  rem.add(j);
    			  int l = revbad.get(j);
    			  revbad.remove(j);
    			  bad.remove(l);
    		  }
    	  }
    	  for(int j: rem)
    		  cyc.remove(j);
      }*/
      HashSet<Integer> shift = new HashSet<Integer>();
      for(int i = 0; i < 2*n; i++) {
    	  if(i < n && axor[i%n] == bxor[0]) {
    		  shift.add(i);
    	  }
    	  HashSet<Integer> rem = new HashSet<Integer>();
    	  for(int j:shift) {
    		  if(axor[i%n] != bxor[(i-j)%n])
    			  rem.add(j);
    	  }
    	  for(int j: rem)
    		  shift.remove(j);
      }
      for(int i: shift) {
    	  out.println(i + " " + (a[i]^b[0]));
      }
      out.close();
   }
}