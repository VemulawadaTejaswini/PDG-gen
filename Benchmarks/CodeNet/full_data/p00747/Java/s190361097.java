import java.util.*;

public class Main {

	int w, h, m, n;
	boolean[][] field;

	class Pos{
		int x, y, cnt;
		Pos(int x, int y, int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

	void Search(){
		Queue<Pos> Q = new LinkedList<Pos>();
		Q.offer(new Pos(0,0,1));
		while(!Q.isEmpty()){
			Pos now = Q.poll();
			if(m-1==now.x&&n-1==now.y){
				System.out.println(now.cnt);
				return;
			}
			if(now.x+2<m&&field[now.x+1][now.y]){
				Q.offer(new Pos(now.x+2,now.y,now.cnt+1));
				field[now.x+1][now.y] = false; 
			}
			if(now.y+2<n&&field[now.x][now.y+1]){
				Q.offer(new Pos(now.x,now.y+2,now.cnt+1));
				field[now.x][now.y+1] = false;
			}
			if(now.x-2>=0&&field[now.x-1][now.y]){
				Q.offer(new Pos(now.x-2,now.y,now.cnt+1));
				field[now.x-1][now.y] = false;
			}
			if(now.y-2>=0&&field[now.x][now.y-1]){
				Q.offer(new Pos(now.x,now.y-2,now.cnt+1));
				field[now.x][now.y-1] = false;
			}
		}
		System.out.println("0");
	}

	void run(){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			w = stdIn.nextInt();
			h = stdIn.nextInt();
			if(w==0&&h==0){
				return;
			}
			m = h*2-1;
			n = w*2-1;
			field = new boolean[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if((i+j)%2==0){
						continue;
					}
					if(stdIn.nextInt()==0){
						field[i][j] = true;
					}
				}	
			}
			Search();
		}
	}

	public static void main(String[] args) {
		new AOJ1166().run();
	}
}