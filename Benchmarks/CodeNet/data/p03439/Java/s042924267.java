	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
 
	        int N = sc.nextInt();
	        System.out.println(N-1);
        	String NS = sc.next();
	        System.out.println(0);
	        String RS=sc.next();
        	if(NS.equals("Vacant"))return;
        	if(RS.equals("Vacant"))return;
	        int R=0;
	        N=N-1;
	        for(int i=0;i<25;i++) {
	        	int mid = (N+R)/2;
	        	System.out.println(mid);
	        	String tmp = sc.next();
	        	if(tmp.equals("Vacant"))return;
	        	if(((mid-R)%2==1&&!RS.equals(tmp)) || ((mid-R)%2==0&&RS.equals(tmp))) {
	        		R=mid;
	        		RS=tmp;
	        	} else {
	        		N=mid;
	        		NS=tmp;
	        	}
	        }
	        
	       
	    }
 
	}