	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int H = 55555;
	        int[] m = new int[H];
	        int[] p = new int[H];
	        int k=0;
	        m[1]=1;
	        int cnt=0;
	        int[] ans = new int[2000];
	        for(int i=2;i<H;i++) {
	        	if(m[i]==0) {
	        		m[i]=1;
	        		p[k]=i;
	        		k++;
	        		if(i%5==1) {
	        			ans[cnt]=i;
	        			cnt++;
	        		}
	        		for(int j=i+i;j<H;j=j+i) {
	        			m[j]=i;
	        		}
	        	}
	        }
	        
	        int N = sc.nextInt();
	        
	        for(int i=0;i<N;i++) {
		        System.out.print(ans[i]);
		        if(i!=N-1) {
			        System.out.print(" ");		        	
		        }
	        }
	    }
	}