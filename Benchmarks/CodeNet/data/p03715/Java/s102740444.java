	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long H = sc.nextInt();	
	        long W = sc.nextInt();	
	        if(H%3==0||W%3==0) {
	        	System.out.println(0);
	        	return;
	        }
	        long ans=1000000000;
	        for(int i=0;i<H;i++) {
	        	long x=W/2;
	        	long a=x*i;
	        	long b=(W-x)*i;
	        	long c=W*(H-i);
	        	long max = Math.max(a, b);
	        	max=Math.max(max, c);
	        	long min = Math.min(a, b);
	        	min =Math.min(min, c);
	        	ans=Math.min(ans,max-min);
	        }
	        for(int i=0;i<W;i++) {
	        	long x=H/2;
	        	long a=x*i;
	        	long b=(H-x)*i;
	        	long c=H*(W-i);
	        	long max = Math.max(a, b);
	        	max=Math.max(max, c);
	        	long min = Math.min(a, b);
	        	min =Math.min(min, c);
	        	ans=Math.min(ans,max-min);
	        }
	        
	        
	        System.out.println(ans);
	    }
	}