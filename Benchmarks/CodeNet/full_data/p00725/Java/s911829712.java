import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2585().doIt();
    }
    class aoj2585{
    	int W,H;
    	int map[][] = new int[21][21];
    	int mx[] = {0,1,0,-1};
    	int my[] = {1,0,-1,0};
    	int result = 11;
    	class Par{
    		int y,x;
    		public Par(int y,int x){
    			this.y = y;
    			this.x = x;
    		}
    	}
    	void dfs(int W,int H,Par end,Par start,int cnt){
//    		System.out.println(start.x+" "+start.y+" "+end.x+" "+end.y);
    		if(start.x == end.x && start.y == end.y){
    			result = Math.min(result,cnt);
    		}
    		if(cnt < result){
    			for(int i = 0;i < 4;i++){
    				if(start.x + mx[i] < 0 || start.x + mx[i] >= W
    						|| start.y + my[i] < 0 || start.y + my[i] >= H)continue;
    				else if(map[start.y + my[i]][start.x + mx[i]] == 1)continue;
    				else{
    					int num = 1;
    					boolean last = false;
    					while(true){
    						num++;
    						if(start.x + mx[i]*num < 0 || start.x + mx[i]*num >= W
    	    						|| start.y + my[i]*num < 0 || start.y + my[i]*num >= H){
    							last = true;
    							break;
    						}
    	    				else if(map[start.y + my[i]*num][start.x + mx[i]*num] == 1)break;
    					}
    					if(!last){
							map[start.y + my[i]*num][start.x + mx[i]*num] = 0;
							dfs(W,H,end,new Par(start.y + my[i]*(num-1),start.x + mx[i]*(num-1)),cnt+1);
							map[start.y + my[i]*num][start.x + mx[i]*num] = 1;
						}else{
							dfs(W,H,end,new Par(start.y + my[i]*(num-1),start.x + mx[i]*(num-1)),cnt+1);
						}
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			Par end = null,start = null;
    			W = sc.nextInt();
    			H = sc.nextInt();
    			if(W + H == 0)break;
    			for(int i = 0;i < H;i++){
    				for(int j = 0;j < W;j++){
    					map[i][j] = sc.nextInt();
    					if(map[i][j] == 2){
    						start = new Par(i,j);
    					}
    					else if(map[i][j] == 3)end = new Par(i,j);
    				}
    			}
    			dfs(W,H,end,start,0);
    			if(result == 11)System.out.println("-1");
    			else System.out.println(result);
    			result = 11;
    		}
    	}
    }
}