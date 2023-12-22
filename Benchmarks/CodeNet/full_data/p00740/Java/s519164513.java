import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]){
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String s;
	      int n,p;
	      int m[] = new int[55];

	      try{
	    	  while(!(s = br.readLine()).equals("0 0")){
	    		  for(int i = 0; i < 55; i++) m[i] = 0;

	    		  String ss[] = s.split(" ");
	    		  n = Integer.parseInt(ss[0]);
	    		  p = Integer.parseInt(ss[1]);

	    		  for(int i = 0; true; i = (i+1)%n){
    				  
	    			  if(p == 0){
	    				  p = m[i];
	    				  m[i] = 0;
	    			  }else{
	    				  p--;
	    				  m[i]++;
	    			  }
	    			  
/*
    				  for(int j = 0; j < n; j++){
    					  System.out.print(" "+ m[j]);
    				  }
    				  System.out.println("  + " + p);
	*/
	    			  
	    			  if(p == 0){
	    				  int c = 0;
	    				  for(int j = 0; j < n; j++){
	    					  //System.out.print(" "+ m[j]);
	    					  if(m[j] != 0) c++;
	    				  }
	    				  //System.out.println(" = " + c);
	    				  if(c <= 1){
	    					  System.out.println(i);
	    					  break;
	    				  }
	    			  }
	    		  }
	    	  }

	      }catch(Exception e){
	    	  System.out.println("Exception :" + e);
	      }
	}
}