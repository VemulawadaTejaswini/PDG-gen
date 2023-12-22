import java.awt.Point;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
  
public class Main {
     
    static int H, W, C;
    static int[][] P;
    
    static int[][] p;
    static boolean[][] check;
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    static int calc(int[] order)
    {
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				p[y][x] = P[y][x];
			}
		}
    	
    	for (int i = 0; i < 6; i++) {
    		int color = p[0][0];
    		
    		for (int y = 0; y < H; y++) {
    			for (int x = 0; x < W; x++) {
    				check[y][x] = false;
    			}
    		}
    		
    		LinkedList<Point> queue = new LinkedList<Point>();
    		queue.offer(new Point(0, 0));
    		while(!queue.isEmpty())
    		{
    			Point poi = queue.poll();
    			if( poi.x < 0 || W <= poi.x || poi.y < 0 || H <= poi.y )  continue;
    			if(check[poi.y][poi.x] == true) continue;
    			
    			check[poi.y][poi.x] = true;
    			for (int j = 0; j < 4; j++) {
					int x = poi.x + dx[j];
					int y = poi.y + dy[j];
					if( x < 0 || W <= x || y < 0 || H <= y )  continue;
					
					if(p[y][x] == color) queue.offer(new Point(x, y));
				}
    		}
    		
    		if(i == 5) break;
    		
    		for (int y = 0; y < H; y++) {
    			for (int x = 0; x < W; x++) {
    				if(check[y][x] == true) p[y][x] = order[i];
    			}
    		}
		}
    	
    	int count = 0;
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				if(check[y][x] == true) count++;
			}
		}
    	
    	return count;
    }
     
    static void start()
    {
    	int max = 0;
    	p = new int[H][W];
    	check = new boolean[H][W];
    	
        for (int i0 = 1; i0 <= 6; i0++) {
        	
        	for (int i1 = 1; i1 <= 6; i1++) {
        		
        		for (int i2 = 1; i2 <= 6; i2++) {
        			
        			for (int i3 = 1; i3 <= 6; i3++) {
        				
        				max = Math.max(max, calc(new int[]{i0, i1, i2, i3, C}));
        			}
        		}
    		}
		}
        
        System.out.println(max);
    }
      
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
            H = sca.nextInt();
            W = sca.nextInt();
            C = sca.nextInt();
            if(H == 0) break;
             
             P = new int[H][W];
             for (int y = 0; y < H; y++) {
				for (int x = 0; x < W; x++) {
					P[y][x] = sca.nextInt();
				}
			}
            
            start();
        }
         
    }
}