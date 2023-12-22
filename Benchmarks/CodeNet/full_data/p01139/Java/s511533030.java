import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new A().doIt();
    }
    class A{
    	int map[][];
    	int W = 0;int B = 0;int X = 0;int Y = 0;
    	int mx[] = {0,1,0,-1};
    	int my[] = {1,0,-1,0};
    	boolean w,b;
    	
    	int dfs(int y,int x,int cnt){
    		if(cnt == 0){
    			map[y][x] = -1;
    			cnt++;
    		}
    		for(int i = 0;i < 4;i++){
    			if(x + mx[i] < X && x + mx[i] >= 0 &&
    					y + my[i] < Y && y + my[i] >= 0){
    				if(map[y + my[i]][x + mx[i]] == 0){
    					map[y + my[i]][x + mx[i]] = -1;
    					cnt = dfs(y + my[i],x + mx[i],cnt+1);
    				}else if(map[y + my[i]][x + mx[i]] == 1){
    					w = true;
    				}else if(map[y + my[i]][x + mx[i]] == 2){
    					b = true;
    				}
    			}
    		}
    		if(w && b)cnt = 0;
    		return cnt;
    	}
    	
    	void check(){
    		for(int i = 0;i < Y;i++){
    			for(int j = 0;j < X;j++){
    				System.out.printf("%3d",map[i][j]);
    			}
    			System.out.println();
    		}
    		System.out.println();
    	}
    	
        void doIt(){
        	while(true){
        		B = 0;W = 0;
        		X = sc.nextInt();
        		Y = sc.nextInt();
        		if(X + Y == 0)break;
        		map = new int [Y][X];
        		for(int i = 0;i < Y;i++){
        			String str = sc.next();
        			char ctr[] = str.toCharArray();
        			for(int j = 0;j < X;j++){
        				if(ctr[j] == 'W')map[i][j] = 1;
        				else if(ctr[j] == 'B')map[i][j] = 2;
        				else map[i][j] = 0;
        			}
        		}
        		for(int i = 0;i < Y;i++){
        			for(int j = 0;j < X;j++){
        				if(map[i][j] == 0){
        					w = false;b = false;
        					int cnt = dfs(i,j,0);
//        					System.out.println(w+" "+b+" "+cnt);
//        					check();
        					if(w && !b)W += cnt;
        					else if(!w && b)B += cnt;
        				}
        			}
        		}
        		System.out.println(B+" "+W);
        	}
        }
    }
}