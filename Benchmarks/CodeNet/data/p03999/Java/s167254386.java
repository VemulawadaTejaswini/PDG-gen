	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        int N = c.length;
	        int[] m = new int[N];
	        for(int i=0;i<N;i++) {
	        	m[i] = c[i]-'0';
	        }
	        
	        long ans=0;
	        long k=1;
	        for(int i=0;i<1<<(N-1);i++) {
		        long tmp=m[N-1];
	        	for(int j=N-2;j>=0;j--) {
	        		if(((i>>j)&1)==1) {
	        			k=k*10;
	        			tmp=tmp+m[j]*k;
	        		} else {
	        			k=1;
	        			ans=ans+tmp;
	        			tmp=m[j];
	        			k=1;
	        		}
	        	}
	        	ans=ans+tmp;
	        	tmp=0;
	        	k=1;
	        }
	        
	        System.out.println(ans);
	        
	    }
	}