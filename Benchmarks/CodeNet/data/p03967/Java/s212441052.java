	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();	        
	        int cntp=0;
	        int cntg=0;
	        for(int i=0;i<c.length;i++) {
	        	if(c[i]=='p') {
	        		cntp++;
	        	} else {
	        		cntg++;
	        	}
	        }
	        int ans=cntg-cntp;
	        System.out.println(ans/2);
	    }
	}