	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int[][] visited = new int[H][W];
	        LinkedList<Integer> p= new LinkedList<Integer>();
	        int cnt=0;
	        for(int i=0;i<H;i++) {
	        	String S = sc.next();
	        	char[] c = S.toCharArray();
	        	for(int j=0;j<W;j++) {
	        		if(c[j]=='#') {
	        			visited[i][j]++;
	        	        p.offer(i*W+j);
	        	        cnt++;
	        		}
	        	}
	        }
	        
	        long ans=0;
	        while(!p.isEmpty()) {
	        	int t=p.poll();
	        	int h = t/W;
	        	int w = t%W;
	        	int d=visited[h][w];
	        	ans=Math.max(ans, d);
	        	if(cnt==W*H+1)break;
	        	visited[h][w]=d;
	        	if(h<H-1&&visited[h+1][w]==0) {
	        		p.offer((h+1)*W+w);
	        		visited[h+1][w]=d+1;
	        		cnt++;
	        	}
	        	if(h>0&&visited[h-1][w]==0) {
	        		p.offer((h-1)*W+w);
	        		visited[h-1][w]=d+1;
	        		cnt++;
	        	}
	        	if(w>0&&visited[h][w-1]==0) {
	        		p.offer(h*W+w-1);
	        		visited[h][w-1]=d+1;
	        		cnt++;
	        	}
	        	if(w<W-1&&visited[h][w+1]==0) {
	        		p.offer(h*W+w+1);
	        		visited[h][w+1]=d+1;
	        		cnt++;
	        	}
	        }
	        
	        
	        System.out.println(ans-1);
	    }
	}