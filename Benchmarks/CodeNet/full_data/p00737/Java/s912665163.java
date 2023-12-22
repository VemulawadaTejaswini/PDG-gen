import java.awt.Point;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
     
	static int W, H;
	static int[][] s;
	static int[] c;
	
    static void start()
    {
    	int[][][] cost = new int[H][W][4];
    	Boolean[][][] check = new Boolean[H][W][4];
    	
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				for (int d = 0; d < 4; d++) {
					cost[y][x][d] = Integer.MAX_VALUE;
					check[y][x][d] = false;
				}
			}
		}
    	cost[0][0][0] = 0;
    	
    	int[] dx = {1, 0, -1,  0};
    	int[] dy = {0, 1,  0, -1};
    	
    	while(true)
    	{
    		int cx = 0, cy = 0, cd = 0;
    		
    		// 次のcx, cy, cdを探す
    		int min = Integer.MAX_VALUE;
    		for (int y = 0; y < H; y++) {
    			for (int x = 0; x < W; x++) {
    				for (int d = 0; d < 4; d++) {
    					if(check[y][x][d] == true) continue;
    					
    					if(cost[y][x][d] < min)
    					{
    						min = cost[y][x][d];
    						cy = y;
    						cx = x;
    						cd = d;
    					}
    				}
    			}
    		}
    		if(min == Integer.MAX_VALUE) break;
    		
    		check[cy][cx][cd] = true;
    		for (int i = 0; i < 4; i++) {
				int nd = (cd + i) % 4;
				int nx = cx + dx[nd];
				int ny = cy + dy[nd];
				
				if ( !( 0<=nx && nx <= W-1) ) continue;
				if ( !( 0<=ny && ny <= H-1) ) continue;
				if( check[ny][nx][nd] == true ) continue;
				
				if(s[cy][cx] == i)
					cost[ny][nx][nd] = Math.min(cost[ny][nx][nd], cost[cy][cx][cd]);
				else {
					cost[ny][nx][nd] = Math.min(cost[ny][nx][nd], cost[cy][cx][cd] + c[i]);
				}
			}
    	}
    	
    	System.out.println(Math.min(cost[H-1][W-1][0], cost[H-1][W-1][1]));
    	
//    	System.out.println("-- cost ----------------------------------------------------");
//    	
//    	for (int y = 0; y < H; y++) {
//			for (int x = 0; x < W; x++) {
//				for (int d = 0; d < 4; d++) {
//					System.out.println("cost[" + y + "][" + x + "][" + d + "] = " + cost[y][x][d]);
//					System.out.println("check[" + y + "][" + x + "][" + d + "] = " + check[y][x][d]);
//				}
//			}
//		}
//    	
//    	System.out.println("----------------------------------------------------------");
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	W = sca.nextInt();
        	H = sca.nextInt();
        	if(W == 0) break;
        	
        	s = new int[H][W];
        	for (int y = 0; y < H; y++) {
				for (int x = 0; x < W; x++) {
					s[y][x] = sca.nextInt();
				}
			}
        	
        	c = new int[4];
        	for (int i = 0; i < 4; i++) {
				c[i] = sca.nextInt();
			}
            
            start();
        }
        
    }
}