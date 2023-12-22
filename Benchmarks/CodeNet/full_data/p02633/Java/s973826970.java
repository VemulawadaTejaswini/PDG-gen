	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        double X = sc.nextInt();
	        double x=0;
	        double y=0;
	        int ans=0;
        	x=x+Math.cos(Math.toRadians(X));
        	y=y+Math.sin(Math.toRadians(X));
        	ans++;
        	for(int i=2;Math.abs(x)>0.01 || Math.abs(y)>0.01;i++) {
	        	x=x+Math.cos(Math.toRadians(i*X));
	        	y=y+Math.sin(Math.toRadians(i*X));
	        	//System.out.println(y);
	        	ans++;
	        }
	        
	        System.out.println(ans);
	    }
	}