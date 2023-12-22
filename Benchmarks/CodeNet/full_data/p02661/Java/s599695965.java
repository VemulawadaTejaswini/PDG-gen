	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        
	        int N = sc.nextInt();
	        Integer[][] a = new Integer[N][3];
	        Integer[][] b = new Integer[N][3];
	        for(int i=0;i<N;i++) {
	        	a[i][0] = Integer.parseInt(sc.next());
	        	a[i][1] = Integer.parseInt(sc.next());
	        	a[i][2] = i;
	        	b[i][0] = a[i][0];
	        	b[i][1] = a[i][1];
	        	b[i][2] = a[i][2];
	        }
	        Arrays.sort(a, (d, c) -> Integer.compare(d[0], c[0]));
	        Arrays.sort(b, (d, c) -> Integer.compare(c[1], d[1]));
	        long ans=0;
	        if(N%2==1) {
	        	Integer min = a[N/2][0];
	        	Integer max = b[N/2][1];
        		Integer r = 0;
        		ans=max-min+1;
	        	for(int i=0;i<N;i++) {
	        		if(r>=max)break;
	        		if(r<a[i][0]&&min<a[i][0]) {
	        			ans=ans-(Math.min(a[i][0], max)-Math.max(r, min)-1);
	        		}
	        		r=Math.max(r, a[i][1]);
	        	}
	        	
	        } else {
	        	Integer min = a[N/2-1][0]+a[N/2][0];
	        	Integer max = b[N/2-1][1]+b[N/2][1];
        		ans=(max-min+1);
	        	
	        }
	        
	        System.out.println(ans);
	    }
	}