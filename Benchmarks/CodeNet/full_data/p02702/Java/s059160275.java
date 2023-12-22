import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int res = 0;
	      for(int i = 0; i < c.length; i++) {
	    	  long a = c[i] - '0';
	    	  if(a == 0)
	    		  continue;
	    	  for(int j = i + 1; j < c.length; j++) {
	    		  a = a * 10 + (c[j] - '0');
	    		  if(a % 2019 == 0) {
	    			  res++;
	    			  a = 0;
	    		  }
	    	  }
	      }
	      System.out.println(res);
	}
}