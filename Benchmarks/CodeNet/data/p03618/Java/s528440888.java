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
	        long ans = (long)N*(N-1)/2+1;
	        
	        long[] m = new long[26];
	        for(int i=0;i<N;i++) {
	        	m[c[i]-'a']++;
	        }
	        
	        for(int i=0;i<26;i++) {
	        	ans=ans-m[i]*(m[i]-1)/2;
	        }
	        
	        System.out.println(ans);
	        
		 }
		 
	}