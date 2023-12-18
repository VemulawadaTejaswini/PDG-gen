	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();

	        long[][] ans=new long[1000][1000];
	        long t=1;
	        int cnt=0;
	        for(int i=1;N>0;i++) {
	        	N=N-i;
	        	for(int j=0;j<i;j++) {
	        		ans[i][j]=t+j;
	        		ans[j][i-1]=t+j;
	        	}
	        	t=t+i;
	        	cnt++;
	        }
	        
	        StringBuffer str = new StringBuffer();
	        if(N<0) {
	        	System.out.println("No");
	        } else {
	        	System.out.println("Yes");
	        	System.out.println(cnt+1);
	        	for(int i=0;i<cnt+1;i++) {
	        		str.append(cnt);
	        		str.append(" ");
	        		for(int j=0;j<cnt;j++) {
		        		str.append(ans[i][j]);
		        		str.append(" ");	        			
	        		}
	        		str.append("\n");	        				        		
	        	}
	        }
	        System.out.println(str);
		 }
	}