import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int H  = scan.nextInt();
			int W  = scan.nextInt();
			GM[][]map = new GM[H][W];
			for(int i = 0;i<H;i++) {
				String s = scan.next();
				char[]c = new char[s.length()];
				c = s.toCharArray();
				for(int j = 0;j<W;j++) {
					map[i][j] = new GM(c[j],i,j);
				}
			}
			
			int []dx = {0,1,0,-1};
			int []dy = {1,0,-1,0};
			
			Deque<GM>queue = new ArrayDeque<GM>();
			queue.addFirst(map[0][0]);
			map[0][0].se = true;
			
			while(!queue.isEmpty()) {
				GM p = queue.removeLast();
				for(int i = 0;i<4;i++) {
					int x = p.x+dx[i];
					int y = p.y+dy[i];
					if(0<=x&&x<W&&0<=y&&y<H) {
						if(map[y][x].type!='#'&&map[y][x].se ==false) {
							queue.addFirst(map[y][x]);
							map[y][x].se = true;
							map[y][x].kyori = p.kyori+1;
							//map[y][x].sy = p.y;
							//map[y][x].sx = p.x;
						}
					}
					
				}
			}
			
			
			
			
			int X = W-1;
			int Y = H-1;
			map[Y][X].sirusi=1;
			if(map[Y][X].kyori==0) {
				System.out.println(-1);
				System.exit(0);
			}
			
			
			while(true) {
				if(map[Y][X].kyori==0) {
					map[Y][X].sirusi = 1;
					break;
				}
				for(int i = 0;i<4;i++) {
					int x =X+dx[i];
					int y= Y+dy[i];
					if(0<=x&&x<W&&0<=y&&y<H) {
						if(map[Y][X].kyori-map[y][x].kyori==1&&map[y][x].type=='.') { 
							X = x;
							Y = y;
							map[Y][X].sirusi =1;
							break;
						}
					}
				}
				
			}
			
			
			
			/*
			int X = W-1;
			int Y = H-1;
			map[Y][X].sirusi   =1;
			
			while(true) {
				if(Y==0&&X==0) {
					map[Y][X].sirusi = 1;
					break;
				}
				X = map[Y][X].sx;
				Y = map[Y][X].sy;
				map[Y][X].sirusi=1;
			}
			*/
			
			
			int count = 0;
			for(int i = 0;i<H;i++) {
				for(int j = 0;j<W;j++) {
					if(map[i][j].type=='.') {
						if(map[i][j].sirusi==1) {
							//System.out.print(map[i][j].kyori);
							//System.out.print('@');
						}else {
							//System.out.print(map[i][j].kyori);
							//System.out.print('.');
							count++;
						}
					
					}
					//else System.out.print(map[i][j].type);
					
					
					
				}
				//System.out.println();
			}
			
			
			
			
			System.out.println(count);
			
			
			
		}
		
		
	}
	
	
	static class GM{
		int y ;
		int x;
		boolean se;
		char type;
		int kyori = 0;
		int sy;
		int sx;
		int sirusi  =0;
		GM(char s,int Y,int X){
			type = s;y = Y;x = X;
		}
	}
		

}
