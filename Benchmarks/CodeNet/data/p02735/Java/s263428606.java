import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        
	        int[][] m = new int[H][W];
	        for(int i=0;i<H;i++) {
	        	String S = sc.next();
	        	char[] c=S.toCharArray();
	        	for(int j=0;j<W;j++) {
	        		if(c[j]=='.') {
	        			m[i][j]=0;
	        		} else {
	        			m[i][j]=1;
	        		}	
	        	}
	        }
	        
	        LinkedList<Integer> queue1 = new LinkedList<Integer>();
	        LinkedList<Integer> queue2 = new LinkedList<Integer>();        
	        boolean flg=true;
	        int ans=0;
	        if(m[0][0]==0) {
		        queue1.add(0);
		        queue1.add(0);
	        } else {
		        queue2.add(0);
		        queue2.add(0);
		        flg=false;
	        }
	        boolean[][] visited = new boolean[H][W];
	        while(visited[H-1][W-1]==false) {
	        	if(flg) {
	        		while(!queue1.isEmpty()) {
	        			int h = queue1.poll();
	        			int w = queue1.poll();
	        			visited[h][w]=true;
	        			for(int i=h-1;i<=h+1;i++) {
	        				for(int j=w-1;j<=w+1;j++) {
		        				if(i==-1||i==H||j==-1||j==W)continue;
	        					if(visited[i][j])continue;
	        					if(i!=h&&j!=w)continue;
	        					if(m[i][j]==0) {
	        						queue1.add(i);
	        						queue1.add(j);
	        	        			visited[i][j]=true;
	        					} else {
	        						queue2.add(i);
	        						queue2.add(j);	        						
	        					}
	        				}
	        			}
	        			
	        		}
	        	} else {
	        		ans++;
	        		while(!queue2.isEmpty()) {
	        			int h = queue2.poll();
	        			int w = queue2.poll();
	        			visited[h][w]=true;
	        			for(int i=h-1;i<=h+1;i++) {
	        				for(int j=w-1;j<=w+1;j++) {
		        				if(i==-1||i==H||j==-1||j==W)continue;
	        					if(visited[i][j])continue;
	        					if(i!=h&&j!=w)continue;
	        					if(m[i][j]==1) {
	        						queue2.add(i);
	        						queue2.add(j);
	        	        			visited[i][j]=true;
	        					} else {
	        						queue1.add(i);
	        						queue1.add(j);	        						
	        					}
	        				}
	        			}
	        		}
	        	}
	        	if(flg) {
	        		flg=false;
	        	} else {
	        		flg=true;
	        	}
	        }
	        
	        
	        	System.out.println(ans);
	        	        	        
	 }
}