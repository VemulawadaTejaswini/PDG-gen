	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        long X = sc.nextLong();
	        long[] c = new long[N];
	        long[][] a = new long[N][M];
	        for (int i=0 ; i<N; i++) {
	            c[i] = Long.parseLong(sc.next());
		        for (int j=0 ; j<M; j++) {
		            a[i][j] = Long.parseLong(sc.next());		        	
		        }
	        }
	        long ans=Long.MAX_VALUE;
	        
	        for(int i=0;i<(2<<N);i++) {
	        	long tmp=0;
	        	long[] m = new long[M];
	        	for(int j=0;j<N;j++) {
	        		if(((i>>j)&1)==1) {
	        			tmp=tmp+c[j];
	        			for(int k=0;k<M;k++) {
	        				m[k]=m[k]+a[j][k];
	        			}
	        		}
	        	}
	        	boolean flg=false;
	        	for(int j=0;j<M;j++) {
	        		if(m[j]<X)flg=true;
	        	}
	        	if(flg==false) {
	        		ans=Math.min(ans, tmp);
	        	}
	        	
	        }
	        
	        if(ans==Long.MAX_VALUE) {
	        	ans=-1;
	        }
	        System.out.println(ans);
	    }
	}