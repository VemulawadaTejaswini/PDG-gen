import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] v1 = {0,1,0,-1};
	static int[] v2 = {1,0,-1,0};
	static int count;
	static int[][] dis;
	static int min;
	static boolean[] already;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int w=cin.nextInt();
			int h=cin.nextInt();
			if(w+h==0){
				break;
			}
			min=999999999;
			int[][] a = new int[h+2][w+2];
			int[][] bangou = new int[h+2][w+2];
			int[][] coor = new int[11][2];
			count=1;
			for(int i = 0;i<h;i++){
				String str=cin.next();
				for(int j = 0;j<w;j++){
					if(str.charAt(j)=='.'){
						a[i+1][j+1]=1;
					}
					else if(str.charAt(j)=='o'){
						a[i+1][j+1]=3;
						coor[0][0]=i+1;
						coor[0][1]=j+1;
					}
					else if(str.charAt(j)=='x'){
						a[i+1][j+1]=0;
					}
					else if(str.charAt(j)=='*'){
						a[i+1][j+1]=2;
						coor[count][0]=i+1;
						coor[count][1]=j+1;
						bangou[i+1][j+1]=count;
						count++;
					}
				}
			}
			dis = new int[count][count];
			already = new boolean[count];
			for(int i = 0;i<count;i++){
				int[][] copy = new int[h+2][w+2];
				for(int x = 0;x<h+2;x++){
					for(int y = 0;y<w+2;y++){
						copy[x][y]=a[x][y];
					}
				}
				int x = coor[i][0];
				int y = coor[i][1];
				copy[x][y]=0;
				Integer[] pair ={x,y,0};
				Queue<Integer[]> q = new LinkedList<Integer[]>();
				q.add(pair);
				while(!q.isEmpty()){
					Integer[] p = q.poll();

					for(int c = 0;c<4;c++){
						int xx=p[0]+v1[c];
						int yy=p[1]+v2[c];
						int distance=p[2];
						if(copy[xx][yy]==1){
							Integer[] next={xx,yy,distance+1};
							copy[xx][yy]=0;
							q.add(next);
						}
						else if(copy[xx][yy]==2){
							dis[i][bangou[xx][yy]]=distance+1;
							Integer[] next={xx,yy,distance+1};
							copy[xx][yy]=0;
							q.add(next);
						}
						else if(copy[xx][yy]==3){
							dis[i][0]=distance+1;
							Integer[] next={xx,yy,distance+1};
							copy[xx][yy]=0;
							q.add(next);
						}
					}
				}
			}
			for(int i = 0;i<count;i++){
				for(int j=0;j<count;j++){
					//System.out.print(dis[i][j]+ " ");
				}
				//System.out.println();
			}
			already[0]=true;
			backtrack(0,0,0);
			if(min==999999999){
				System.out.println(-1);
			}
			else{
				System.out.println(min);
			}
		}
	}
	static void backtrack(int start,int sum,int cnt){
		//System.out.println(start+" " + sum+" " +cnt);
		if(sum>min){
			return;
		}
		if(cnt==count-1){
			min=Math.min(sum, min);
		}
		for(int i = 1;i<count;i++){
			if(dis[start][i]!=0&&!already[i]){
				int tmp=dis[start][i];
				dis[start][i]=dis[i][start]=0;
				already[i]=true;
				backtrack(i,sum+tmp,cnt+1);
				already[i]=false;
				dis[start][i]=dis[i][start]=tmp;
			}
		}
	}
}