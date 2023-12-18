//package bleh;
	//package bleh;
    import java.io.BufferedReader;
import java.util.Collections;
import java.util.HashMap;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Scanner;
     
    public class Main {
     
      public static void solve(Scanner in) {
//        int t = in.nextInt();
//        while (t-- > 0) {
//   		//enter code here
//
//        }
    	  int n=in.nextInt();
    	  int k=in.nextInt();
    	  HashMap<Integer,Integer>map=new HashMap<>();
    	  if(Math.abs(n-k)==n||Math.abs(n-k)==k)
    		  System.out.print(n);
    	  else {
    		  while(true) {
    			  int x=Math.abs(n-k);
    			  if(map.containsKey(x)) {
    				  break;
    			  }
    			  else {
    				  map.put(x, 1);
    			  }
    			  n=x;
    		  }
    	  }
    	  int min=Collections.min(map.values());
    	  System.out.println(min);
      }
     
      public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Solution sol = new Solution();
        sol.solve(in);
      }
    }
