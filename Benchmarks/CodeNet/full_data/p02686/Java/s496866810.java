	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
//		 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();

	        String[] S = new String[N];
	        int[][] minlast = new int[N][4];
	        for (int i=0 ; i<N; i++) {
	            S[i] = sc.next();
	            char[] c = S[i].toCharArray();
	            int now =0;
	            for(int j=0;j<S[i].length();j++) {
	            	if(c[j]=='(') {
	            		now++;
	            	} else {
	            		now--;
	            		minlast[i][0] = Math.min(minlast[i][0], now);
	            	}
	            }
	            minlast[i][1]=now;
	            minlast[i][3]=minlast[i][0]-now;
	        }
	        Arrays.sort(minlast, (b, c) -> Integer.compare(b[0], c[0]));
	        boolean[] used = new boolean[N];
	        int now1 = 0;
	        for(int i=N-1;i>=0;i--) {
	        	if(minlast[i][1]>0) {
	        		if(now1+minlast[i][0]<0) {
	        			System.out.println("No");
	        			return;
	        		}
	        		now1=now1+minlast[i][1];
	        	}
	        }
	        
	        for(int i=0;i<N;i++) {
	        	if(minlast[i][1]==0) {
	        		if(now1+minlast[i][0]<0) {
	        			System.out.println("No");
	        			return;	        			
	        		}
	        		now1=now1+minlast[i][1];
	        	}
	        }
	        Arrays.sort(minlast, (b, c) -> Integer.compare(b[3], c[3]));
	        int now2 = 0;
	        for(int i=0;i<N;i++) {
	        	if(minlast[i][1]<0) {
	        		if(now2+(minlast[i][0]-minlast[i][1])<0) {
	        			System.out.println("No");
	        			return;	        			
	        		}
	        		now2=now2-minlast[i][1];
	        	}
	        }
	        

	        if(now1==now2) {
	        	System.out.println("Yes");
	        } else {
	        	System.out.println("No");
	        }

	    }
	    
	    

	}
	