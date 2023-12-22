	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        int H = 1000000;
	        int[] m = new int[1000005];
	        for(int i=0;i<N;i++) {
	        	m[sc.nextInt()]++;
	        }
	        long ans=0;
	        for(int i=1;i<=H+3;i++) {
	        	if(m[i]==1) {
	        		ans++;
	        		for(int j=i+i;j<H+5;j=j+i) {
	        			if(m[j]==1)m[j]++;
	        		}
	        	}
	        }
	        
	        System.out.println(ans);
	    }
	}