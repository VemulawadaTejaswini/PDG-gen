import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int w,h,min;
	static int[] leftx={-1,-1,-1,-1,-1,-2,-2,-2,-3};
	static int[] lefty={2,1,0,-1,-2,1,0,-1,0};
	static Wall[][] wall;
	static Queue<Integer[]> q = new LinkedList<Integer[]>();
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			w=cin.nextInt();
			h=cin.nextInt();
			if(w+h==0){
				break;
			}
			min=Integer.MAX_VALUE;
			wall=new Wall[h][w];
			for(int i = 0;i<h;i++){
				for(int j = 0;j<w;j++){
					String s = cin.next();
					int a = 0;
					if(s.equals("T")){
						a=-2;
					}
					else if(s.equals("S")){
						a=-1;
					}
					else if(s.equals("X")){
						a=-3;
					}
					else{
						a=Integer.parseInt(s);
					}
					wall[i][j]=new Wall(a);
				}
			}
			for(int i = 0;i<h;i++){
				for(int j = 0;j<w;j++){
					//System.out.print(wall[i][j].cost+" ");
				}
				//System.out.println();
			}
			for(int i = 0;i<h;i++){
				for(int j = 0;j<w;j++){
					if(wall[i][j].cost==-1){
						Integer[] a = {i,j,0,0};
						Integer[] b = {i,j,1,0};
						wall[i][j].min[0]=wall[i][j].min[1]=0;
						q.add(a);q.add(b);
					}
				}
			}
			while(!q.isEmpty()){
				Integer[] a=q.poll();
				int cost,y,x,isRight;
				y=a[0];x=a[1];isRight=a[2];cost=a[3];
				if(cost>wall[y][x].min[isRight]||wall[y][x].cost==-3||min<cost){
					//System.out.println("    "+x+" " +y+" " +isRight+" "+cost);
					continue;
				}
				if(wall[y][x].cost==-2){
					min=Math.min(min, cost+2);
					break;
				}
				wall[y][x].min[isRight]=cost;
				int right=0;

				if(isRight==0){
					right=1;
					isRight=1;
				}
				else{
					right=-1;
					isRight=0;
				}
				for(int i = 0;i<leftx.length;i++){
					int xx=x+leftx[i]*right;
					int yy=y+lefty[i]*right;
					if(xx<0||xx>=w||yy<0||yy>=h){
						continue;
					}
					if(wall[yy][xx].cost==-3||wall[yy][xx].cost==-1){
						continue;
					}
					Integer[] next={yy,xx,isRight,cost+wall[yy][xx].cost};
					q.add(next);
				}		
			}
			if(min==Integer.MAX_VALUE){
				System.out.println(-1);
			}
			else{
				System.out.println(min);
			}
		}
	
	}
	
	static void climb(int y,int x,int isRight,int cost){
		//System.out.println(x+" " +y+" " +isRight+" "+cost);
		if(cost>wall[y][x].min[isRight]||wall[y][x].cost==-3||min<cost){
			//System.out.println("    "+x+" " +y+" " +isRight+" "+cost);
			return;
		}
		if(wall[y][x].cost==-2){
			min=Math.min(min, cost+2);
			return;
		}
		wall[y][x].min[isRight]=cost;
		int right=0;

		if(isRight==0){
			right=1;
			isRight=1;
		}
		else{
			right=-1;
			isRight=0;
		}
		for(int i = 0;i<leftx.length;i++){
			int xx=x+leftx[i]*right;
			int yy=y+lefty[i]*right;
			if(xx<0||xx>=w||yy<0||yy>=h){
				continue;
			}
			if(wall[yy][xx].cost==-3||wall[yy][xx].cost==-1){
				continue;
			}
			climb(yy,xx,isRight,cost+wall[yy][xx].cost);


		}
	}
}

class Wall{
	int cost;
	int[] min;
	Wall(int a){
		cost=a;
		min=new int[2];
		min[0]=min[1]=Integer.MAX_VALUE;
	}
}