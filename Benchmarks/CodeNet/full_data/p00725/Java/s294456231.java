import java.util.*;

public class Main{
	public static final int[] dx = {1, 0, -1,  0};
	public static final int[] dy = {0, 1,  0, -1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer[]> deque = new ArrayDeque<Integer[]>();
		Deque<Integer[]> wall_data = new ArrayDeque<Integer[]>();
		Integer[] wall = new Integer[18];
		int w, h;
		int reach_x = 0, reach_y = 0, min = 0;

		while(true){
			deque.clear();
			wall_data.clear();
			w = sc.nextInt();
			h = sc.nextInt();
			if(w+h==0) break;

			int[][] field = new int[h+2][w+2];
			for(int i=1; i<h+1; i++){
				for(int j=1; j<w+1; j++){
					field[i][j] = sc.nextInt();
					if(field[i][j]==2){
						Integer[] p = {j, i, 0};
						deque.addLast(p);
						field[i][j] = 0;
						reach_x = j;
						reach_y = i;
					}
				}
			}
			wall_data.addLast(wall);

			while(!deque.isEmpty()){
				Integer[] ball = deque.pollFirst();
				Integer[] punished_wall = wall_data.pollFirst();

				for(int i=0; i<ball[2]; i++){
					field[punished_wall[i*2+1]][punished_wall[i*2]] = 0;
				}

				for(int i=0; i<4; i++){
					int x = ball[0];
					int y = ball[1];
					int count = ball[2];

					if(field[y+dy[i]][x+dx[i]]!=1){
						while(x>0&&x<w+1&&y>0&&y<h+1&&field[y+dy[i]][x+dx[i]]==0){
							y += dy[i];
							x += dx[i];
						}
						reach_x = x;
						reach_y = y;
						if(x!=0&&x!=w+1&&y!=0&&y!=h+1){
							if(field[y+dy[i]][x+dx[i]]==3){
								reach_x = x + dx[i];
								reach_y = y + dy[i];
								break;
							}
							if(count<9){
								Integer[] new_punished_wall = Arrays.copyOf(punished_wall, punished_wall.length);
								new_punished_wall[count*2] = x+dx[i];
								new_punished_wall[count*2+1] = y+dy[i];
								count++;
								Integer[] q = {x, y, count};
								deque.addLast(q);
								wall_data.addLast(new_punished_wall);
							}
						}
					}
				}
				for(int i=0; i<ball[2]; i++){
					field[punished_wall[i*2+1]][punished_wall[i*2]] = 1;
				}
				min = ball[2] + 1;
				if(field[reach_y][reach_x]==3) break;
			}
			if(field[reach_y][reach_x]==3){
				System.out.println(min);
			}else{
				System.out.println("-1");
			}
		}
	}
}