import java.util.Scanner;
import java.util.Arrays;
public class Main {
	static int h, w,hoge=0,nextX,nextY,count=1;
	static int map[][];
	static int board[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		board = new int[w][h];
		map = new int[w][h];
		int flag=0;
		for (int i = 0; i < h; i++) {
			for(int j=0;j<w;j++){
				board[j][i] = sc.nextInt();
				if(j==0 || i==0){
					if(board[j][i]==0){
						flag=1;
						map[j][i]=1;
					}
					else{
						map[j][i]=0;
					}
				}
			}
		}
		if(h==1 || w==1){
			System.out.println(flag);
		}
		else{
			int ans=(int)Math.pow(squ(1,1),2),temp=0;
			while(true){
				if(hoge==1){
					hoge=0;
					//System.out.println("loop");
					temp=(int)Math.pow(squ(nextX,nextY),2);
				}
				if(hoge==0){
					break;
				}
				if(ans<temp){
					ans=temp;
				}
			}
			System.out.println(ans);
		}
		//System.out.println(Arrays.toString(map));
		/*for(int i=0;i<h;i++){
		  for(int j=0;j<w;j++){
		  System.out.print(map[j][i]+" ");
		  }
		  System.out.println();
		  }*/
	}
	static int squ(int x,int y) {
		//System.out.println("x="+x);
		if(x==w){
			//System.out.print("x=="+x);
			x=1;
			y++;
			//System.out.println(",y=="+y);
		}
		if(y==h){
			return 0;
		}
		if((y+count)*(x+count)>(100*99)*count){
			count++;
			nextX=x;
			nextY=y;
			hoge=1;
			return 0;
		}
		if(board[x][y]==1){
			map[x][y]=0;
		}
		else{
			int min=map[x-1][y];
			for(int i=-1;i<1;i++){
				//System.out.println(i);
				if(min>map[x+i][y-1]){
					min=map[x+i][y-1];
				}
			}
			map[x][y]=min+1;
		}
		int max=squ(x+1,y);
		if(max<map[x][y]){
			max=map[x][y];
		}
		return max;
	}
}