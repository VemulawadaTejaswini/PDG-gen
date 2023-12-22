import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Coordinate> deque = new ArrayDeque<Coordinate>();
		int w, h;
		int wall;

		while(true){
			deque.clear();
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0) break;
			Coordinate[][] room = new Coordinate[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					room[i][j] = new Coordinate(i, j);
				}
			}
			for(int i=0; i<2*h-1; i++){
				switch(i%2){
					case 0:
						for(int j=0; j<w-1; j++){
							wall = sc.nextInt();
							room[i/2][j].right += wall;
							room[i/2][j+1].left += wall;
						}
						break;
					case 1:
						for(int j=0; j<w; j++){
							wall = sc.nextInt();
							room[i/2][j].under += wall;
							room[i/2+1][j].up += wall;
						}
						break;
				}
			}
			room[0][0].settled = true;
			deque.offerLast(room[0][0]);
			while(!deque.isEmpty()){
				Coordinate room1 = deque.pollFirst();
				if(room1.left == 0&&room1.x>0){
					if(!room[room1.y][room1.x-1].settled){
						room[room1.y][room1.x-1].settled = true;
						room[room1.y][room1.x-1].count = room1.count + 1;
						deque.offerLast(room[room1.y][room1.x-1]);
					}
				}
				if(room1.up == 0&&room1.y>0){
					if(!room[room1.y-1][room1.x].settled){
						room[room1.y-1][room1.x].settled = true;
						room[room1.y-1][room1.x].count = room1.count + 1;
						deque.offerLast(room[room1.y-1][room1.x]);
					}
				}
				if(room1.right == 0&&room1.x<w-1){
					if(!room[room1.y][room1.x+1].settled){
						room[room1.y][room1.x+1].settled = true;
						room[room1.y][room1.x+1].count = room1.count + 1;
						deque.offerLast(room[room1.y][room1.x+1]);
					}
				}
				if(room1.under == 0&&room1.y<h-1){
					if(!room[room1.y+1][room1.x].settled){
						room[room1.y+1][room1.x].settled = true;
						room[room1.y+1][room1.x].count = room1.count + 1;
						deque.offerLast(room[room1.y+1][room1.x]);
					}
				}
				if(room[h-1][w-1].settled) break;
			}
			if(room[h-1][w-1].settled){
				System.out.println(room[h-1][w-1].count);
			}else{
				System.out.println("0");
			}
		}
	}

	static class Coordinate{
		public int x, y;
		public int left = 0, right = 0, up = 0, under = 0;
		public int count = 1;
		public boolean settled = false;
		public Coordinate(int i, int j){
			x = j;
			y = i;
		}
	}
}