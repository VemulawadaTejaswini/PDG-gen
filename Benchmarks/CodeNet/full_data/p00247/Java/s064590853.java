import java.util.Scanner;

public class Main {

	static int[][] f;
	static int[][] step;
	static int w,h,xs,ys,xg,yg;
	static Ice[] ice;
	static int iceCount;
	static int[] v1={1,0,-1,0};
	static int[] v2={0,-1,0,1};
	static int a;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			w=cin.nextInt();
			h=cin.nextInt();
			if(w+h==0){
				break;
			}
			a=0;
			f=new int[h][w];
			step=new int[h][w];
			ice=new Ice[h*w/2];
			for(int i = 0;i<h;i++){
				for(int j = 0;j<w;j++){
					step[i][j]=h*w*2;
				}
			}
			for(int i = 0;i<h;i++){
				String s = cin.next();
				for(int j = 0;j<s.length();j++){
					if(s.charAt(j)=='.'){
						f[i][j]=-1;
					}
					else if(s.charAt(j)=='#'){
						f[i][j]=-2;
					}
					else if(s.charAt(j)=='X'){
						f[i][j]=-3;
					}
					else if(s.charAt(j)=='S'){
						xs=i;
						ys=j;
						f[i][j]=-1;
						step[i][j]=0;
					}
					else{
						xg=i;
						yg=j;
						f[i][j]=-1;
					}
					
				}
			}
			iceCount=0;
			for(int i = 0;i<h;i++){
				for(int j = 0;j<w;j++){
					if(f[i][j]==-3){
						a=0;
						bfsIce(i,j);
						ice[iceCount++]=new Ice(a);
					}
				}
			}
			bfs(xs,ys);
			System.out.println(step[xg][yg]);
		}
	}
	static void bfs(int x,int y){
		//System.out.println(x+" " +y + " " + step[x][y]);
		for(int i =0;i<4;i++){
			
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(xx<0||xx>=h||yy<0||yy>=w){
				continue;
			}
			if(f[xx][yy]!=-2){
				if(f[xx][yy]>=0){
					ice[f[xx][yy]].step++;
					if(ice[f[xx][yy]].isBroken()){
						//System.out.println("break "+f[xx][yy]+" " + xx+" " + yy);
						ice[f[xx][yy]].step--;
						continue;
					}
				}
				if(step[x][y]+1 <= step[xx][yy]){
					step[xx][yy]=step[x][y]+1;
					bfs(xx,yy);
				}
				if(f[xx][yy]>=0){
					ice[f[xx][yy]].step--;
				}
			}
		}
	}
	static void bfsIce(int x,int y){
		f[x][y]=iceCount;
		a++;
		for(int i = 0;i<4;i++){
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(xx<0||xx>=h||yy<0||yy>=w){
				continue;
			}
			if(f[xx][yy]==-3){
				bfsIce(xx,yy);
			}
		}
	}
}
class Ice{
	int size;
	int step;
	boolean isBroken(){
		return size/2+1 <= step;
	}
	Ice(int a){
		size=a;
		step=0;
	}
}
class Field{
	int type;
	int size;
	int step;
	Field(int a){
		size=a;
		step=0;
	}
	
}