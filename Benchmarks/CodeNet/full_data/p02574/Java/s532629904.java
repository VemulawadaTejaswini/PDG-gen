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
	        long[] a = new long[N];
	        int[][] m1 = new int[N][205];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }

	        int H = 1000005;
	        int[] m = new int[H];
	        int[] p = new int[H];
	        int k=0;
	        m[1]=1;
	        for(int i=2;i<H;i++) {
	        	if(m[i]==0) {
	        		m[i]=1;
	        		p[k]=i;
	        		k++;
	        		for(int j=i+i;j<H;j=j+i) {
	        			m[j]=i;
	        		}
	        	}
	        }		        
	        
	        int[] m2 = new int[1000005];
	        int[] z = new int[N];
	        String ans = "pairwise coprime";
	        for(int i=0;i<N;i++) {
		        int[] mn = new int[H];
	        	while(a[i]!=1) {
	        		if(m[(int)a[i]]!=1) {
	        				int tmp =(int)a[i];
		        			m2[m[tmp]]++;
		        			while(a[i]%m[tmp]==0) {
		        				a[i]=a[i]/m[tmp];
		        			}
	        		} else {
	        			m2[(int)a[i]]++;
	        			a[i]=1;
	        		}
	        	}
	        }
	        
	        for(int i=0;i<1000005;i++) {
	        	if(m2[i]>1)ans = "setwise coprime";
	        	if(m2[i]==N) {
	        		ans = "not coprime";
	        		break;
	        	}
	        }
	        
	        System.out.println(ans);
		 }
		 
	}