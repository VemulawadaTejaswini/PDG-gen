	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        int N = c.length;
	        long ans = N*(N-1)/2+1;
	        
	        for(int i=0;i<N-1;i++) {
	        	int j = i;
	        	int k = i+1;
	        	boolean flg = true;
	        	while(j>=0&&k<N&&flg==true) {
	        		if(c[j]==c[k]) {
	        			ans--;
	        		} 
        			j--;
        			k++;
        		}
	        }
	        for(int i=0;i<N-2;i++) {
	        	int j = i;
	        	int k = i+2;
	        	boolean flg = true;
	        	while(j>=0&&k<N&&flg==true) {
	        		if(c[j]==c[k]) {
	        			ans--;
	        		} 
        			j--;
        			k++;
	        	}	        	
	        }
	        
	        System.out.println(ans);
	        
		 }
		 
	}