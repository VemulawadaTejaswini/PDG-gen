import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		boolean[] visit = new boolean[c.length];
        int res = 0 ;
	      for(int i = 0; i < c.length; i++) {
	    	  if(visit[i])
	    		  continue;
	    	  visit[i] = true;
	    	  Set<Integer> set = new HashSet<>();
	    	  int a = c[i] - '0';
	    	  if(a == 0)
	    		  continue;
	    	  set.add(a);
	    	  for(int j = i + 1; j < c.length; j++) {
	    		  a = a * 10 + (c[j] - '0');
	    		  if(a % 2019 == 0) {
	    			  res += set.size();
	    			  a = 0;
	    			  set.add(j + 1);
	    			  if(j + 1 < c.length)
	    				  visit[j + 1] = true;
	    		  }
	    	  }
	      }
	      System.out.println(res);
	}
}