	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        long ans=0;
        	int acnt=0;
	        for(int i=0;i<c.length;i++) {
	        	if(c[i]=='A') {
	        		if(c[i+1]=='A')acnt++;
	        		if(c[i+1]=='B'&&c[i+2]=='C') {
	        			ans=ans+acnt+1;
	        			i=i+3;
	        			while(i<c.length-1&&c[i]=='B'&&c[i+1]=='C') {
	        				ans++;
	        				i=i+2;
	        			}
	        			i--;
	        			acnt++;
	        		}
	        		
	        	} else {
	        		acnt=0;
	        	}
	        	
	        }
	        
	        
	        System.out.println(ans);
	        
	    }
	}