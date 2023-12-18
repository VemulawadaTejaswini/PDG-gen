import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
	 static int[][] c;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        
	        c=new int[10][10];
	        for(long i=0;i<10;i++)list.add(new ArrayList<Integer>());	        
	        for(int i=0;i<10;i++) {
	        	for(int j=0;j<10;j++) {
	        			c[i][j]=sc.nextInt();
	        	}
	        }
	        
	        
	        LinkedList<Integer> queue = new LinkedList<Integer>();
        	int[] weight = new int[10];
	        for(int i=0;i<10;i++) {
	        	boolean[] visited=new boolean[10];
	        	queue.add(i);
	        	queue.add(0);
	        	int min=c[i][1];
	        	while(!queue.isEmpty()){
	        		int now = queue.poll();
	        		int w = queue.poll();
	        		visited[now]=true;
	        		for(int j=0;j<10;j++) {
	        			if(now==j)continue;
	        			if(visited[j])continue;
	        			if(w>min)continue;
	        			if(j==1) {
	        				min=Math.min(min, w+c[now][j]);
	        			} else {
	        				if(w+c[now][j]<min) {
		        				queue.add(j);
		        				queue.add(w+c[now][j]);	        					
	        				}
	        			}
	        		}
	        	}
	        	weight[i]=min;
	        }
	        
	        int ans=0;
	        for(int i=0;i<H;i++) {
	        	for(int j=0;j<W;j++) {
	        		int tmp=sc.nextInt();
	        		if(tmp!=-1) {
	        			ans=ans+weight[tmp];
	        		}
	        	}
	        }
	        
	        
	        
	        System.out.println(ans);
	        
	 }
	 

}
