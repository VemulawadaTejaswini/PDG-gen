	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        String S = sc.next();
	        char[] c1 = S.toCharArray();
	        char[] c = new char[N];
	        for(int i=0;i<N;i++) {
	        	c[i]=c1[N-i-1];
	        }
	        int cnt=0;
	        for(int i=0;i<N;i++) {
	        	if(c[i]=='1')cnt++;
	        }
	        long[][] m = new long[N][2];
	        m[0][1]=1;
	        m[0][0]=1;
	        long sum1=0;
	        long sum2=0;
	        for(int i=0;i<N;i++) {
	        	if(cnt==1)m[i][0]=0;
	        	else m[i][0]=pow(2,i,(cnt-1));
	        	m[i][1]=pow(2,i,(cnt+1));
	        	if(c[i]=='1') {
		        	sum2=sum2+m[i][1];	        		
		        	sum1=sum1+m[i][0];
	        	}
	        }
	        
	        int H = 200005;
	        long[] a = new long[H];
	        a[1]=1;
	        for(int i=1;i<H;i++) {
	        	int t=0;
	        	for(int j=0;j<20;j++) {
	        		t=t+(i>>j)%2;
	        	}
        		t=i%t;
        		a[i]=a[t]+1;
	        }
	        
	        
	        
	        long[] ans = new long[N];
	        for(int i=0;i<N;i++) {
	        	int t;
	        	if(c[N-i-1]=='1') {
	        		if(cnt==1)ans[i]=0;
	        		else{
	        			t=(int)((sum1-m[N-i-1][0])%(cnt-1));
		        		ans[i]=a[t]+1;
	        		}
	        	} else {
	        		t=(int)((sum2+m[N-i-1][1])%(cnt+1));
	        		ans[i]=a[t]+1;
	        	}
	        }
	        for(int i=0;i<N;i++) {
	        	System.out.println(ans[i]);
	        }
	        
	        

		 }
			public static long pow(long a,long n,long mod) {
			    long res=1;
			    while (n>0) {
			        if ((n-n/2*2)==1) {
			            res=(res*a)%mod;
			        }
			        a=(a*a)%mod;
			        n>>=1;
			    }
			    return res;
			}
	}