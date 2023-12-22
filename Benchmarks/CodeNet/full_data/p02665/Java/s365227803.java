	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        
	        int N = sc.nextInt()+1;	
	        int[] a = new int[N];
	        long sum=0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = Integer.parseInt(sc.next());
	            sum=sum+a[i];
	        }
	        long cnt=0;
	        long[] m = new long[50];
	        m[0]=1;
	        for(int i=1;i<50;i++) {
	        	m[i]=m[i-1]*2;
	        }
	        for(int i=0;i<Math.min(N, 26);i++) {
	        	cnt=cnt*2+a[i];
	        	if(cnt>Math.pow(2, i)) {
	        		System.out.println(-1);
	        		return;
	        	}
	        }
	        long ans=0;
	        for(int i=0;i<Math.min(50, N);i++) {
	        	if(a[i]==0)continue;
	        	for(int j=0;j<=i;j++) {
	        		if(m[j]>0)ans=ans+Math.min(m[j], a[i]);
	        		m[j]=m[j]-a[i];
	        	}
	        	for(int j=i+1;j<50;j++) {
	        		m[j]=(long) (m[j]-Math.pow(2,j-i)*a[i]);
	        	}
	        }
	        for(int i=50;i<N;i++) {
	        	ans=ans+(i+1)*a[i];
	        }
	        
	        
	        
	        System.out.println(ans);
	    }
	}