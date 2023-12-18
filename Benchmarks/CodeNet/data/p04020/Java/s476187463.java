	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        int[] a = new int[N];
	        for(int i=0;i<N;i++) {
	        	a[i] = sc.nextInt();
	        }
	        long ans=0;
	        for(int i=0;i<N;i++) {
	        	ans=ans+a[i]/2;
	        	if(i!=0&&a[i-1]%2==1&&a[i]%2==1) {
	        		ans++;
	        		a[i]--;
	        	}
	        }
	        
	        System.out.println(ans);
	       
	    }

	}