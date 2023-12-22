import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int w, h;
		int[][] u;
		int[][] d;
		int[][] l;
		int[][] r;
		int[][] dist;
		int[][] flag;
		int t = 0;

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
				break;

			u = new int[h][w];
			d = new int[h][w];
			l = new int[h][w];
			r = new int[h][w];
			dist = new int[h][w];
			flag = new int[h][w];

			for(int i = 0; i < h; i++){
				l[i][0] = 1;
				r[i][w-1] = 1;
			}
			for(int j = 0; j < w; j++){
				u[0][j] = 1;
				d[h-1][j] = 1;
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w-1; j++){
					r[i][j] = sc.nextInt();
					l[i][j+1] = r[i][j];
				}
				if(i == h - 1)
					continue;
				for(int j = 0; j < w; j++){
					d[i][j] = sc.nextInt();
					u[i+1][j] = d[i][j];
				}
			}

			Queue xQueue = new Queue(w * h);
			Queue yQueue = new Queue(w * h);

			xQueue.enqueue(0);
			yQueue.enqueue(0);
			dist[0][0] = 1;

			while(!xQueue.isEmpty()){
				x = xQueue.dequeue();
				y = yQueue.dequeue();
				if(x == h-1 && y == w-1){
					System.out.println(dist[x][y]);
					t = 1;
					break;
				}
				if(d[x][y] == 0 && flag[x+1][y] == 0){
					xQueue.enqueue(x+1);
					yQueue.enqueue(y);
					dist[x+1][y] = dist[x][y] + 1;
					flag[x+1][y] = 1;
				}
				if(r[x][y] == 0 && flag[x][y+1] == 0){
					xQueue.enqueue(x);
					yQueue.enqueue(y+1);
					dist[x][y+1] = dist[x][y] + 1;
					flag[x][y+1] = 1;
				}
				if(u[x][y] == 0 && flag[x-1][y] == 0){
					xQueue.enqueue(x-1);
					yQueue.enqueue(y);
					dist[x-1][y] = dist[x][y] + 1;
					flag[x-1][y] = 1;
				}
				if(l[x][y] == 0 && flag[x][y-1] == 0){
					xQueue.enqueue(x);
					yQueue.enqueue(y-1);
					dist[x][y-1] = dist[x][y] + 1;
					flag[x][y-1] = 1;
				}
			}
			if(t == 0)
				System.out.println(0);
		}
	}
}
class Queue{
	int SIZE;
	int head = 0;
	int tail = 0;
	int[] val;

	Queue(int iSIZE){
		SIZE = iSIZE;
		val = new int[SIZE];
	}

	int next(int index){
		return (index+1)%SIZE;
	}

	boolean isEmpty(){
		return (head == tail);
	}

	boolean enqueue(int data){
		if(next(tail) == head)
			return false;
		else{
			val[tail] = data;
			tail = next(tail);
			return true;
		}
	}

	int dequeue(){
		int data;
		if(isEmpty()){
			data = -1;
		}else{
			data = val[head];
			head = next(head);
		}
		return data;
	}
}