import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			int H = scan.nextInt();
			int W = scan.nextInt();
			GM[][]map = new GM[H][W];

			for(int i = 0;i<H;i++) {
				String s = scan.next();
				char[]c = s.toCharArray();
				for(int j = 0;j<W;j++) {
					map[i][j] = new GM(i,j,c[j]);
				}
			}

			int ok = 1;

			int[]dx =  {1,0,-1,0};//右下左上
			int[]dy =  {0,1,0,-1};

			Deque<GM>queue = new ArrayDeque<GM>();
			queue.addFirst(map[0][0]);
			map[0][0].ch = true;

			while(!queue.isEmpty()) {
				GM p = queue.removeLast();
				for(int i = 0;i<4;i++) {
					int x = dx[i]+p.x;
					int y = dy[i]+p.y;
					if(0<=x&&x<W&&0<=y&&y<H) {
						if(map[y][x].ch==false&&map[y][x].type!='.') {
							queue.addFirst(map[y][x]);
							map[y][x].ch = true;
							map[y][x].d = p.d+1;
							if((dx[i]==0&&dy[i]==-1)||(dx[i]==-1&&dy[i]==0)) {
								ok=0;
								break;
							}
						}
					}
				}
			}

			if(ok==0) {
				System.out.println("Impossible");
				return;
			}

			Map<Integer,Integer>mp = new TreeMap<Integer,Integer>();

			for(int i = 0;i<H;i++) {
				for(int j = 0;j<W;j++) {
					if(map[i][j].type=='#') {
					//System.out.println(map[i][j].d);
					if(mp.containsKey(map[i][j].d))mp.put(map[i][j].d, mp.get(map[i][j].d)+1);
					else mp.put(map[i][j].d, 1);
					}
				}
			}

			for(Integer key:mp.keySet()) {
				int a = mp.get(key);
				if(a>1) {
					ok=0;
					break;
				}
			}

			if(ok==0)System.out.println("Impossible");
			else System.out.println("Possible");






		}


	}




	private static class GM{
		int y;
		int x;
		boolean ch = false;
		char type;
		int d = 0;
		GM(int i,int j,char c){
			y = i;
			x = j;
			type = c;
		}
	}


}
