import java.util.*;
public class Main {
	static Queue<Coordinate> q = new LinkedList<Coordinate>();
	static class Coordinate{
		int x,y;
		Coordinate(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int counter = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N==0&&M==0){
				break;
			}
			String input;
			char[][] test = new char[N+2][M+2];
			for(int i=0;i<(M+2);i++){
				test[0][i] = '.';
				test[N+1][i] = '.';
			}
			for(int i=0;i<(N+2);i++){
				test[i][0] = '.';
				test[i][M+1] = '.';
			}
			for(int i=1;i<N+1;i++){
				input = sc.next();
				for(int j=1;j<M+1;j++){
					test[i][j] = input.charAt(j-1);
				}
			}
			
			for(int i=1;i<N+1;i++){
				for(int j=1;j<M+1;j++){
					if(test[i][j]!='.'){
						Coordinate cor= new Coordinate(i,j);
						q.offer(cor);
						//bfs(test,q);
						while(!q.isEmpty()){
							Coordinate pair = q.poll();
							int x = pair.x, y = pair.y;
							char buf = test[x][y];
							test[x][y] = '.';
							if(buf!='.'){
								if(buf==test[x-1][y]){
									Coordinate cor1 = new Coordinate(x-1,y);
									q.add(cor1);
									
								}
								if(buf==test[x+1][y]){
									Coordinate cor1 = new Coordinate(x+1,y);
									q.add(cor1);
									
								}
								if(buf==test[x][y-1]){
									Coordinate cor1 = new Coordinate(x,y-1);
									q.add(cor1);
									
								}
								if(buf==test[x][y+1]){
									Coordinate cor1 = new Coordinate(x,y+1);
									q.add(cor1);
									
								}
							}
						}
						counter++;
					}
				}
			}
			System.out.println(counter);
		}
	}
}