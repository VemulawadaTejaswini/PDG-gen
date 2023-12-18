import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();

			int[] a = new int[N];
			GM[][] map = new GM[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					map[i][j] = new GM(i , j);

				}
			}
			for (int i = 0; i < N; i++) {
				a[i] = scan.nextInt();
			}
			
			int mode = 0;
			int Y = 0;
			int X = 0;
			
			map[Y][X].num = 1;
			
			int[] dy = { 1, 0, -1, 0 };
			int[] dx = { 0, 1, 0, -1 };
			int allcount = 1;
			
			Deque<GM>que = new ArrayDeque<GM>();
			Deque<GM>st = new ArrayDeque<GM>();
			que.addFirst(map[Y][X]);
			st.addFirst(map[Y][X]);
			map[Y][X].se = true;

			
				
				while(!que.isEmpty()) {
					if(allcount==H*W)break;
					GM p = que.removeLast();
					int y = p.y+dy[mode];
					int x = p.x+dx[mode];
					
					if(0<=y&&y<H&&0<=x&&x<W) {
						if(map[y][x].se==false) {
							que.addFirst(map[y][x]);
							st.addFirst(map[y][x]);
							map[y][x].se = true;
							allcount++;
							
							//System.out.println(y+" "+x+"  "+allcount);
							
							
							
							
	
						}else {
							que.addLast(p);
							mode = (mode+1)%4;
							//System.out.println(y+" "+x+" 変更");

						}
					}else {
						que.addLast(p);
						mode = (mode+1)%4;
						//System.out.println(y+" "+x+"　変更 ");

						
						}
					}
				
				//System.out.println(st.size());
				
				
				for(int i = 0;i<N;i++) {
					for(int j = 0;j<a[i];j++) {
						GM p = st.removeLast();
						p.num=i+1;
					}
				}
				
				
				
				
				
			
				
				
				
				/*
				int sy = 0;
				int sx = 0;

				outside: for (int j = 0; j < H; j++) {
					for (int z = 0; z < W; z++) {
						if (map[j][z].se == false) {
							sy = j;
							sx = z;
							break outside;
						}
					}
				}

				//System.out.println(sy + " " + sx);

				int irocount = a[i];

				Deque<GM> que = new ArrayDeque<GM>();
				que.addFirst(map[sy][sx]);
				map[sy][sx].se = true;
				map[sy][sx].num = i + 1;
				irocount--;
				if (irocount == 0)
					continue;

				int[] dy = { 1, 0, -1, 0 };
				int[] dx = { 0, 1, 0, -1 };

				outside: while (!que.isEmpty()) {
					GM p = que.removeLast();
					for (int j = 0; j < 4; j++) {
						int Y = p.y + dy[j];
						int X = p.x + dx[j];
						if (0 <= Y && Y < H && 0 <= X && X < W) {
							if (map[Y][X].se == false) {
								que.addFirst(map[Y][X]);
								//System.out.println("追加 " + Y + " " + X);
								map[Y][X].se = true;
								map[Y][X].num = i + 1;
								irocount--;
								if (irocount == 0)
									break outside;
							}
						}

					}

				}*/
		

			

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j].num);
					System.out.print(" ");
				}
				System.out.println();
			}

		}

	}

	static class GM {
		int y;
		int x;
		boolean se;
		int num=0;

		GM(int Y, int X) {
			y = Y;
			x = X;
		}

	}

}
