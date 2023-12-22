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
	        
	        int[][] m1 = new int[N][205];
	        int[] m2 = new int[205];
	        int[] z = new int[N];
	        String ans = "pairwise coprime";
	        for(int i=0;i<N;i++) {
		        int[] mn = new int[H];
	        	while(a[i]!=1) {
	        		if(m[(int)a[i]]!=1) {
	        			if(m[(int)a[i]]<1000) {
	        				int tmp =(int)a[i];
		        			mn[m[tmp]]++;
		        			while(a[i]%m[tmp]==0) {
		        				a[i]=a[i]/m[tmp];
		        			}
		        			if(m2[m[tmp]]!=0)ans = "setwise coprime";
		        			m1[i][m[tmp]]=mn[m[tmp]];
		        			m2[m[tmp]]=Math.max(m2[m[tmp]], mn[m[tmp]]);
	        			} else {
	        				z[i]=m[(int)a[i]];
	        				a[i]=a[i]/m[(int)a[i]];	 
	        			}
	        		} else {
	        			int tmp = (int)a[i];
	        			mn[tmp]++;
	        			if(m2[tmp]!=0)ans = "setwise coprime";
	        			m1[i][tmp]=mn[tmp];
	        			m2[tmp]=Math.max(m2[tmp], mn[tmp]);
	        			a[i]=1;
	        		}
	        	}
	        }
	        
	        Arrays.sort(z);
	        for(int i=0;i<N-1;i++) {
	        	if(z[i]==z[i+1]&&z[i]!=0) {
	        		ans = "not coprime";
	        	}
	        }
	        for(int i=0;i<169;i++) {
	        	boolean flg=true;
	        	for(int j=0;j<N;j++) {
	        		if(m1[j][i]==0) {
	        			flg=false;
	        			break;
	        		}
	        	}
	        	if(flg==true)ans = "not coprime";
	        }
	        
	        System.out.println(ans);
		 }
		 
	}