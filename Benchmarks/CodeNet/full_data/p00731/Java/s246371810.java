import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main{
	
	static Queue<Point> queue = new LinkedList<Point>();
	static Queue<Character> footqueue = new LinkedList<Character>();
	static int w;
	static int h;
	static char[][] smap;
	static int[][] nummapr;
	static int[][] nummapl;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			int ssum = 0;
			int gsum = 0;
			sc.nextLine();
			String line = null;
			char[][] map = new char[w][h];
			
			for(int i = 0; i < h; i++){
				line = sc.nextLine().replaceAll(" ", "");
				for(int j = 0; j < w; j++){
					map[j][i] = line.charAt(j);
					if(map[j][i] == 'S'){
						ssum++;
					}else if(map[j][i] == 'T'){
						gsum++;
					}
				}
			}
			smap = map;
			nummapr = new int[w][h];;
			nummapl = new int[w][h];
			int[][] start = new int[2][ssum];
			int[][] goal = new int[2][gsum];
			ssum = 0;
			gsum = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(map[j][i] == 'S'){
						start[0][ssum] = j;
						start[1][ssum] = i;
						ssum++;
					}else if(map[j][i] == 'T'){
						goal[0][gsum] = j;
						goal[1][gsum] = i;
						gsum++;
					}
					nummapr[j][i] = nummapl[j][i] = Integer.MAX_VALUE; 
				}
			}
			
			queue.clear();
			footqueue.clear();
			
			for(int i = 0; i < ssum; i++){
				queue.offer(new Point(start[0][i], start[1][i]));
				nummapl[start[0][i]][start[1][i]] = 0;
				footqueue.offer('l');
				queue.offer(new Point(start[0][i], start[1][i]));
				nummapr[start[0][i]][start[1][i]] = 0;
				footqueue.offer('r');
			}
			int size = 0;
			char direction;
			while(true){
				size = queue.size();
				for(int i = 0; i < size; i++){
					direction = footqueue.poll();
					if(direction == 'r'){
						climbing(queue.peek().x, queue.peek().y,direction,nummapr[queue.peek().x][queue.poll().y]);
					}else if(direction == 'l'){
						climbing(queue.peek().x, queue.peek().y,direction,nummapl[queue.peek().x][queue.poll().y]);
					}

				}
				if(queue.isEmpty() && footqueue.isEmpty()){
					break;
				}
			}
			int sum = Integer.MAX_VALUE;
			for(int i = 0; i < goal[0].length; i++){
				sum = Math.min(sum, nummapl[goal[0][i]][goal[1][i]]);
				sum = Math.min(sum, nummapr[goal[0][i]][goal[1][i]]);
			}
			if(sum == Integer.MAX_VALUE){
				System.out.println("-1");
			}else{
				System.out.println(sum);
			}
		}
	}


	private static void climbing(int x, int y, Character direction, int count) {
		if(direction == 'l'){
			if(y + 2 <= h - 1 && x + 1 <= w - 1 && smap[x + 1][y + 2] != 'X' && smap[x + 1][y + 2] != 'S'
					&& nummapr[x + 1][y + 2] > count + smap[x + 1][y + 2] - 48){
				if(smap[x + 1][y + 2] == 'T'){
					nummapr[x + 1][y + 2] = count;
				}else{
					nummapr[x + 1][y + 2] = count + smap[x + 1][y + 2] - 48;
					queue.offer(new Point(x + 1, y + 2));
					footqueue.offer('r');
				}
			}
			if(y + 1 <= h - 1 && x + 1 <= w - 1 && smap[x + 1][y + 1] != 'X' && smap[x + 1][y + 1] != 'S'
					&& nummapr[x + 1][y + 1] > count + smap[x + 1][y + 1] - 48){
				if(smap[x + 1][y + 1] == 'T'){
					nummapr[x + 1][y + 1] = count;
				}else{
					nummapr[x + 1][y + 1] = count + smap[x + 1][y + 1] - 48;
					queue.offer(new Point(x + 1, y + 1));
					footqueue.offer('r');
				}
			}
			if(y + 1 <= h - 1 && x + 2 <= w - 1 && smap[x + 2][y + 1] != 'X' && smap[x + 2][y + 1] != 'S'
					&& nummapr[x + 2][y + 1] > count + smap[x + 2][y + 1] - 48){
				if(smap[x + 2][y + 1] == 'T'){
					nummapr[x + 2][y + 1] = count;
				}else{
					nummapr[x + 2][y + 1] = count + smap[x + 2][y + 1] - 48;
					queue.offer(new Point(x + 2, y + 1));
					footqueue.offer('r');
				}
			}
			if(x + 1 <= w - 1 && smap[x + 1][y] != 'X' && smap[x + 1][y] != 'S'
					&& nummapr[x + 1][y] > count + smap[x + 1][y] - 48){
				if(smap[x + 1][y] == 'T'){
					nummapr[x + 1][y] = count;
				}else{
					nummapr[x + 1][y] = count + smap[x + 1][y] - 48;
					queue.offer(new Point(x + 1, y));
					footqueue.offer('r');	
				}
			}
			if(x + 2 <= w - 1 && smap[x + 2][y] != 'X' && smap[x + 2][y] != 'S'
					&& nummapr[x + 2][y] > count + smap[x + 2][y] - 48){
				if(smap[x + 2][y] == 'T'){
					nummapr[x + 2][y] = count;
				}else{
					nummapr[x + 2][y] = count + smap[x + 2][y] - 48;
					queue.offer(new Point(x + 2, y));
					footqueue.offer('r');
				}
			}
			if(x + 3 <= w - 1 && smap[x + 3][y] != 'X' && smap[x + 3][y] != 'S'
					&& nummapr[x + 3][y] > count + smap[x + 3][y] - 48){
				if(smap[x + 3][y] == 'T'){
					nummapr[x + 3][y] = count;
				}else{
					nummapr[x + 3][y] = count + smap[x + 3][y] - 48;
					queue.offer(new Point(x + 3, y));
					footqueue.offer('r');	
				}
			}
			if(y - 1 >= 0 && x + 1 <= w - 1 && smap[x + 1][y - 1] != 'X' && smap[x + 1][y - 1] != 'S'
					&& nummapr[x + 1][y - 1] > count + smap[x + 1][y - 1] - 48){
				if(smap[x + 1][y - 1] == 'T'){
					nummapr[x + 1][y - 1] = count;
				}else{
					nummapr[x + 1][y - 1] = count + smap[x + 1][y - 1]- 48;
					queue.offer(new Point(x + 1, y - 1));
					footqueue.offer('r');	
				}
			}
			if(y - 1 >= 0 && x + 2 <= w - 1 && smap[x + 2][y - 1] != 'X' && smap[x + 2][y - 1] != 'S'
					&& nummapr[x + 2][y - 1] > count + smap[x + 2][y - 1]- 48){
				if(smap[x + 2][y - 1] == 'T'){
					nummapr[x + 2][y - 1] = count;
				}else{
					nummapr[x + 2][y - 1] = count + smap[x + 2][y - 1]- 48;
					queue.offer(new Point(x + 2, y - 1));
					footqueue.offer('r');
				}
			}
			if(y - 2 >= 0 && x + 1 <= w - 1 && smap[x + 1][y - 2] != 'X' && smap[x + 1][y - 2] != 'S'
					&& nummapr[x + 1][y - 2] > count + smap[x + 1][y - 2]- 48){
				if(smap[x + 1][y - 2] == 'T'){
					nummapr[x + 1][y - 2] = count;
				}else{
					nummapr[x + 1][y - 2] = count + smap[x + 1][y - 2]- 48;
					queue.offer(new Point(x + 1, y - 2));
					footqueue.offer('r');	
				}
			}
		}else if(direction == 'r'){
			if(y + 2 <= h - 1 && x - 1 >= 0 && smap[x - 1][y + 2] != 'X' && smap[x - 1][y + 2] != 'S'
					&& nummapl[x - 1][y + 2] > count + smap[x - 1][y + 2]- 48){
				if(smap[x - 1][y + 2] == 'T'){
					nummapl[x - 1][y + 2] = count;
				}else{
					nummapl[x - 1][y + 2] = count + smap[x - 1][y + 2]- 48;
					queue.offer(new Point(x - 1, y + 2));
					footqueue.offer('l');	
				}
			}
			if(y + 1 <= h - 1 && x - 1 >= 0 && smap[x - 1][y + 1] != 'X' && smap[x - 1][y + 1] != 'S'
					&& nummapl[x - 1][y + 1] > count + smap[x - 1][y + 1]- 48){
				if(smap[x - 1][y + 1] == 'T'){
					nummapl[x - 1][y + 1] = count;
				}else{
					nummapl[x - 1][y + 1] = count + smap[x - 1][y + 1]- 48;
					queue.offer(new Point(x - 1, y + 1));
					footqueue.offer('l');
				}
			}
			if(y + 1 <= h - 1 && x - 2 >= 0 && smap[x - 2][y + 1] != 'X' && smap[x - 2][y + 1] != 'S'
					&& nummapl[x - 2][y + 1] > count + smap[x - 2][y + 1]- 48){
				if(smap[x - 2][y + 1] == 'T'){
					nummapl[x - 2][y + 1] = count;
				}else{
					nummapl[x - 2][y + 1] = count + smap[x - 2][y + 1]- 48;
					queue.offer(new Point(x - 2, y + 1));
					footqueue.offer('l');	
				}
			}
			if(x - 1 >= 0 && smap[x - 1][y] != 'X' && smap[x - 1][y] != 'S' 
					&& nummapl[x - 1][y] > count + smap[x - 1][y]- 48){
				if(smap[x - 1][y] == 'T'){
					nummapl[x - 1][y] = count;
				}else{
					nummapl[x - 1][y] = count + smap[x - 1][y]- 48;
					queue.offer(new Point(x - 1, y));
					footqueue.offer('l');
				}
			}
			if(x - 2 >= 0 && smap[x - 2][y] != 'X' && smap[x - 2][y] != 'S'
					&& nummapl[x - 2][y] > count + smap[x - 2][y]- 48){
				if(smap[x - 2][y] == 'T'){
					nummapl[x - 2][y] = count;
				}else{
					nummapl[x - 2][y] = count + smap[x - 2][y]- 48;
					queue.offer(new Point(x - 2, y));
					footqueue.offer('l');
				}
			}
			if(x - 3 >= 0 && smap[x - 3][y] != 'X' && smap[x - 3][y] != 'S' 
					&& nummapl[x - 3][y] > count + smap[x - 3][y]- 48){
				if(smap[x - 3][y] == 'T'){
					nummapl[x - 3][y] = count;
				}else{
					nummapl[x - 3][y] = count + smap[x - 3][y]- 48;
					queue.offer(new Point(x - 3, y));
					footqueue.offer('l');
				}
			}
			if(y - 1 >= 0 && x - 1 >= 0 && smap[x - 1][y - 1] != 'X' && smap[x - 1][y - 1] != 'S' 
					&& nummapl[x - 1][y - 1] > count + smap[x - 1][y - 1]- 48){
				if(smap[x - 1][y - 1] == 'T'){
					nummapl[x - 1][y - 1] = count;
				}else{
					nummapl[x - 1][y - 1] = count + smap[x - 1][y - 1]- 48;
					queue.offer(new Point(x - 1, y - 1));
					footqueue.offer('l');
				}
			}
			if(y - 1 >= 0 && x - 2 >= 0 && smap[x - 2][y - 1] != 'X' && smap[x - 2][y - 1] != 'S'
					&& nummapl[x - 2][y - 1] > count + smap[x - 2][y - 1]- 48){
				if(smap[x - 2][y - 1] == 'T'){
					nummapl[x - 2][y - 1] = count;
				}else{
					nummapl[x - 2][y - 1] = count + smap[x - 2][y - 1]- 48;
					queue.offer(new Point(x - 2, y - 1));
					footqueue.offer('l');	
				}
			}
			if(y - 2 >= 0 && x - 1 >= 0 && smap[x - 1][y - 2] != 'X' && smap[x - 1][y - 2] != 'S'
					&& nummapl[x - 1][y - 2] > count + smap[x - 1][y - 2]- 48){
				if(smap[x - 1][y - 2] == 'T'){
					nummapl[x - 1][y - 2] = count;
				}else{
					nummapl[x - 1][y - 2] = count + smap[x - 1][y - 2]- 48;
					queue.offer(new Point(x - 1, y - 2));
					footqueue.offer('l');
				}
			}
		}
	}
}