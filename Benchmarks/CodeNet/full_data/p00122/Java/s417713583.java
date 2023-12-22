import java.util.Scanner;

public class Main {

	static int n;
	static int[][] water;
	static int[][] field;
	static int[] v1={-1,0,1,2,2,2,1,0,-1,-2,-2,-2};
	static int[] v2={-2,-2,-2,-1,0,1,2,2,2,1,0,-1};
	static boolean f;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int x=cin.nextInt();
			int y=cin.nextInt();
			if(x+y==0){
				break;
			}
			f=false;
			n=cin.nextInt();
			water = new int[n][2];
			field=new int[10][10];
			for(int i = 0;i<n;i++){
				water[i][0]=cin.nextInt();
				water[i][1]=cin.nextInt();
			}
			dfs(x,y,0);
			if(f){
				System.out.println("OK");
			}
			else{
				System.out.println("NA");
			}
		}
	}
	static void dfs(int x,int y,int depth){
		//System.out.println(x+" " + y+" " +depth);
		if(f){
			return;
		}
		if(depth==n){
			f=true;
			return;
		}
		toWater(water[depth][0],water[depth][1],1);
		for(int i = 0;i<12;i++){
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(!inRange(xx,yy)){
				continue;
			}
			if(field[xx][yy]==1){
				toWater(water[depth][0],water[depth][1],0);
				dfs(xx,yy,depth+1);
				toWater(water[depth][0],water[depth][1],1);
			}
		}
	}
	static void outputField(){
		for(int i = 0;i<10;i++){
			for(int j = 0;j<10;j++){
				System.out.print(field[i][j]+" " );
				
			}
			System.out.println();
		}
	}
	static void toWater(int x,int y,int a){
		for(int i = -1;i<=1;i++){
			for(int j = -1;j<=1;j++){
				int xx=x+i;
				int yy=y+j;
				if(inRange(xx,yy)){
					field[xx][yy]=a;
				}
			}
		}
	}
	static boolean inRange(int x,int y){
		return x>=0&&x<=9 && y>=0&&y<=9;
	}
}