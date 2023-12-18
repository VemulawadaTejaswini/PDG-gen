import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	 static char[][] S;
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        S = new char[H][W];
        
        
        for(int i=0;i<H;i++){
        	String s=sc.next();
        	S[i] = s.toCharArray();
        }
        
        int max=0;
        max=Math.max(max, kaisi(0,H,W));
        max=Math.max(max, kaisi(W-1,H,W));
        max=Math.max(max, kaisi((H-1)*W,H,W));
        max=Math.max(max, kaisi((H-1)*W+W-1,H,W));
                               
        System.out.println(max);        	
                		
    }
    
    public static int kaisi(int k,int H,int W) {
        int max = 0;
        
        boolean[][] visited = new boolean[H][W];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        int kh=k/W;
        int kw=k%W;
        visited[kh][kw]=true;
        queue.add(k);
        queue.add(0);
        while(!queue.isEmpty()) {
        	int now = queue.poll();
        	int d = queue.poll();
        	max=Math.max(max, d);
        	int nowh=now/W;
        	int noww=now%W;
        	if(kensa(nowh,noww+1,H,W,visited)==1) {
        		queue.add(nowh*W+noww+1);
        		queue.add(d+1);
        		visited[nowh][noww+1]=true;
        	}
        	if(kensa(nowh,noww-1,H,W,visited)==1) {
        		queue.add(nowh*W+noww-1);
        		queue.add(d+1);
        		visited[nowh][noww-1]=true;
        	}
        	if(kensa(nowh+1,noww,H,W,visited)==1) {
        		queue.add((nowh+1)*W+noww);
        		queue.add(d+1);
        		visited[nowh+1][noww]=true;
        	}
        	if(kensa(nowh-1,noww,H,W,visited)==1) {
        		queue.add((nowh-1)*W+noww);
        		queue.add(d+1);
        		visited[nowh-1][noww]=true;
        	}
        }
        return max;
    }
    
    public static int kensa(int nowh,int noww,int H,int W,boolean[][] v) {
    	if(nowh<0||nowh>=H||noww<0||noww>=W) {
    		return -1;
    	}
    	if(v[nowh][noww]==true||S[nowh][noww]=='#') {
    		return -1;
    	}
    	
    	return 1;
    }
    
}