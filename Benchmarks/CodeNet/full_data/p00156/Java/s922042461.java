import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static short[] dx = new short[]{-1,0,1,0},dy = new short[]{0,1,0,-1};
	static final short INF = Short.MAX_VALUE;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int a = 3;
		while(a-->0){
			short w = scan.nextShort();
			short h = scan.nextShort();
			if(w==0) break;
			boolean[][] map = new boolean[h][w];
			short[][] cost = new short[h][w];
			Queue<short[]> que = new LinkedList<short[]>();
			for (short i = 0; i < h; i++) {
				String text = scan.next();
				for (short j = 0; j < w; j++) {
					char chr = text.charAt(j);
					if(chr=='.') map[i][j] = true;
					else{
						map[i][j]=false;
						if(chr=='&'){
							que.offer(new short[]{i,j,0});		//(y,x,cost)
							map[i][j]=true;
						}
					}
					cost[i][j]=INF;
				}
			}

			int min = INF;
			while(!que.isEmpty()){
				short[] yxc = que.poll();
				int py = yxc[0],px = yxc[1],pc = yxc[2];
				cost[py][px]=yxc[2];
				for (int i = 0; i < 4; i++) {
					int y = py+dy[i],x = px+dx[i],c = pc;
					if(x<0 || x>=w || y<0 || y>=h){
						min = Math.min(min, c);
						continue;
					}
					if(!map[y][x] && map[py][px]) c++;
					if(cost[y][x]>c && min>c) que.offer(new short[]{(short)y,(short)x,(short)c});
				}
			}

			out.println(min);
		}

		out.flush();
	}
}