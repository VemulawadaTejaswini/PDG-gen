	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        int H = sc.nextInt();
	        long[] a = new long[H];
	        for(int i=0;i<H;i++) {
	        	a[i] = sc.nextLong();
	        }
	        
	        Arrays.sort(a);
	        long ans = a[H-1];
	        int cnt=1;
	        for(int i=H-2;i>=0;i--) {
	        	if(cnt==H-1)break;
	        	ans=ans+a[i];
	        	cnt++;
	        	if(cnt==H-1)break;
	        	ans=ans+a[i];
	        	cnt++;
	        }
	        
	        System.out.println(ans);

		 }
	}