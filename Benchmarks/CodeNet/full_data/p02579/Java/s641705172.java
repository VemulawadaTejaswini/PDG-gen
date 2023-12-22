	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int sx = sc.nextInt()-1;
	        int sy = sc.nextInt()-1;
	        int gx = sc.nextInt()-1;
	        int gy = sc.nextInt()-1;
	        
	        int[][] m = new int[H][W];
	        for(int i=0;i<H;i++) {
		        String S = sc.next();
		        char[] c = S.toCharArray();
		        for(int j=0;j<W;j++) {
		        	if(c[j]=='#')m[i][j]=-1;
		        	else m[i][j]=10000000;
		        }
	        }
	        
			LinkedList<Integer> q= new LinkedList<Integer>();
			LinkedList<Integer> q2= new LinkedList<Integer>();
			q.add(1000*sy+sx);
			q2.add(1000*sy+sx);
			m[sx][sy]=0;
	        while(!q.isEmpty()) {
		        while(!q2.isEmpty()) {
		        	int now = q2.poll();
		        	int x = now%1000;
		        	int y = now/1000;
		        	for(int i=x-2;i<=x+2;i++) {
		        		for(int j=y-2;j<=y+2;j++) {
		        			if(i==x&&j==y)continue;
		        			if(i>=H||i<0||j>=W||j<0)continue;
		        			if(m[i][j]<=m[x][y])continue;
		        			if(Math.abs(x-i)+Math.abs(y-j)==1) {
		        				m[i][j]=m[x][y];
		        				q.add(1000*j+i);
		        				q2.add(1000*j+i);
		        			}
		        		}
		        	}
		        }
	        	int now = q.poll();
	        	int x = now%1000;
	        	int y = now/1000;
	        	for(int i=x-2;i<=x+2;i++) {
	        		for(int j=y-2;j<=y+2;j++) {
	        			if(i==x&&j==y)continue;
	        			if(i>=H||i<0||j>=W||j<0)continue;
	        			if(m[i][j]<=m[x][y]+1)continue;
	    				m[i][j]=m[x][y]+1;	        				
	    				q.add(1000*j+i);
	        		}
	        	}
	        }
        	int ans=0;
        	if(m[gx][gy]==10000000) {
        		ans=-1;
        	} else {
        		ans=m[gx][gy];
        	}
	        
	        System.out.println(ans);
		 }
		 
	}