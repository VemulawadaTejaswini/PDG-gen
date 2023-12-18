	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        System.out.println(0);
	        String pre="-1";
        	String tmp = sc.next();
        	if(tmp.equals("Vacant"))return;
	        int Np=0;
	        for(int i=0;i<25;i++) {
	        	int mid = (N+Np)/2;
	        	System.out.println(mid);
	        	pre = tmp;
	        	tmp = sc.next();
	        	if(tmp.equals("Vacant"))return;
	        	if(((mid-Np)%2==1&&tmp.equals(pre)) || (mid-Np)%2==0&&!tmp.equals(pre)) {
	        		N=mid;
	        	} else {
	        		Np=mid;
	        	}
	        }
	        
	       
	    }

	}