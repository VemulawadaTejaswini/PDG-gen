import java.awt.Point;
import java.awt.event.FocusAdapter;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.naming.InitialContext;
 
public class Main {
     
	static int W, H;
	static int[][] map;
	static int sx, sy;
	
    static void start()
    {
    	LinkedList<Point> queue = new LinkedList<Point>();
    	queue.offer(new Point(sx, sy));
    	
    	int[][] check = new int[H][W];
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				check[y][x] = 0;
			}
		}
    	
    	while (!queue.isEmpty()) {
			Point p = queue.poll();
			if(check[p.y][p.x] == 1) continue;
			if(map[p.y][p.x] == 1) continue;
			check[p.y][p.x] = 1;
			if(0 < p.x) queue.offer(new Point(p.x-1, p.y));
			if(p.x < W-1) queue.offer(new Point(p.x+1, p.y));
			if(0 < p.y) queue.offer(new Point(p.x, p.y-1));
			if(p.y < H-1) queue.offer(new Point(p.x, p.y+1));
		}
    	
    	int count = 0;
    	for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				if(check[y][x] == 1) count++;
			}
		}
    	
    	System.out.println(count);
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	W = sca.nextInt();
        	H = sca.nextInt();
        	if(W == 0) break;
        	
        	map = new int[H][W];
        	for (int y = 0; y < H; y++) {
        		String str = sca.next();
				for (int x = 0; x < W; x++) {
					switch (str.charAt(x)) {
					case '.': map[y][x] = 0; break;
					case '#': map[y][x] = 1; break;
					case '@':
						map[y][x] = 0;
						sy = y;
						sx = x;
						break;
					}
				}
			}
            
            start();
        }
        
    }
}