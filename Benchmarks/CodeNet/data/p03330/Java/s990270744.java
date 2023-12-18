	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int C = sc.nextInt();
	        int[][] D = new int[C][C];
	        for(int i=0;i<C;i++) {
	        	for(int j=0;j<C;j++) {
	        		D[i][j]=sc.nextInt();
	        	}
	        }
	        int[][] c = new int[N][N];
	        int[] m1 = new int[N*N];
	        int[] m2 = new int[N*N];
	        int[] m3 = new int[N*N];
	        int cnt1 =0;
	        int cnt2 =0;
	        int cnt3 =0;
	        for(int i=0;i<N;i++) {
	        	for(int j=0;j<N;j++) {
	        		c[i][j]=sc.nextInt()-1;
	        		int t = i+j;
	        		if(t%3==0) {
	        			m1[cnt1]=c[i][j];
	        			cnt1++;
	        		}
	        		if(t%3==1) {
	        			m2[cnt2]=c[i][j];
	        			cnt2++;
	        		}
	        		if(t%3==2) {
	        			m3[cnt3]=c[i][j];
	        			cnt3++;
	        		}
	        	}
	        }
	        
	        long ans=Long.MAX_VALUE;
	        boolean flg =false;
	        int[] d = new int[3];
	        while(d[0]<=C-1) {	        	
	        	if(d[0]==d[1])flg=true;
	        	if(d[1]==d[2])flg=true;
	        	if(d[0]==d[2])flg=true;
	        	long sum =0;
	        	if(flg==false) {
		        	for(int i=0;i<N;i++) {
		        		for(int j=0;j<N;j++) {
		        			int t = i+j;
		        			if(t%3==0) {
		        				sum=sum+D[c[i][j]][d[0]];
		        			}
		        			if(t%3==1) {
		        				sum=sum+D[c[i][j]][d[1]];
		        			}
		        			if(t%3==2) {
		        				sum=sum+D[c[i][j]][d[2]];
		        			}
		        		}
		        	}	        		
		        	ans=Math.min(ans,sum);
	        	}

	        	
	        	d[2]++;
	        	if(d[2]>=C) {
	        		d[1]++;
	        		d[2]=0;
	        		if(d[1]>=C) {
	        			d[0]++;
	        			d[1]=0;
	        		}
	        	}
	        	flg=false;
	        }
	        
	        
	        
	        System.out.println(ans);
		 }
		 
	 
	}