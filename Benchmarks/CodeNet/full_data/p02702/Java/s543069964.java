

import java.util.*;

import java.math.*;


public class leet3 { 
	static int[] dp;
    static int mod=(int)1e9+7;
    public static  int help(String s, int k) {
      dp=new int[200000];
      
      
     return fun(s,k,0);
    }
    
    
     public static int fun(String s, int k,int i) {
         
         int cc=0;
        
         for (int j = 0; j <s.length(); j++) {
			for (int j2 = j+1; j2 <s.length(); j2++) {
				if(j2-j>=1 && Long.parseLong(s.substring(j, j2+1))%2019==0)
					cc++;
				
			}
		}
         return cc;
         
     }
	    	
	    
	public static void main(String args[] ) throws Exception {
		Scanner s=new Scanner(System.in);
	//	String hs="1817181712114";
		String hs=s.next();
		 System.out.println(help(hs,2019));
		
}


} 
