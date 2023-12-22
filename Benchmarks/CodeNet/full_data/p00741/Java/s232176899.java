import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static class pair{
		int x,y;
		pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int w=sc.nextInt(),h=sc.nextInt();
			if(w==0&&h==0) return;
			int[][] field = new int[h+2][w+2];
			for(int i=1;i<=h;i++){
				for(int j=1;j<=w;j++){
					field[i][j] = sc.nextInt();
				}
			}
			int result=0;
			for(int i=1;i<=h;i++){
				for(int j=1;j<=w;j++){
					if(field[i][j]==1){
						field = bfs(field,i,j);
						result++;
					}
				}
			}
			System.out.println(result);
		}
	}
	private static int[][] bfs(int[][] field,int x,int y){
		Queue<pair> q = new LinkedList<pair>();
		q.add(new pair(x,y));
		pair now;
		int[] correction = {-1,0,1};
		while(!q.isEmpty()){
			now = q.poll();
			for(int i:correction){
				for(int j:correction){
					if(field[now.x+i][now.y+j]==1){
						q.add(new pair(now.x+i,now.y+j));
						field[now.x+i][now.y+j]=0;
					}
				}
			}
		}
		return field;
	}
}