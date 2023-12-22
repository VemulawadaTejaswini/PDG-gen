import java.io.*;
import java.util.*;

public class Main{
	static int maxTime=11;
	static int w,h;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			//input
			w=scan.nextInt();
			h=scan.nextInt();
			int stoneh=-1;
			int stonew=-1;
			maxTime=11;
			if(w==0 && h==0)break;
			int[][] object=new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					object[i][j]=scan.nextInt();
					if(object[i][j]==2){
						stoneh=i;
						stonew=j;
					}
					//System.out.print(object[i][j]);
				}
			}
			//System.out.println(stoneh+" "+stonew);
			move(0,stoneh,stonew,object);
			if(maxTime==11)maxTime=-1;
			System.out.println(maxTime);
		}
	}
	//stoneH,W---stone's place
	//board------play data
	public static void move(int time,int stoneH,int stoneW,int[][] board){
		if(time<maxTime){
			//System.out.println(maxTime);
			//go Up
			int i;
			int temp;
			if(stoneH!=0 && board[stoneH-1][stoneW]!=1){
				for(i=stoneH-1;i>-1;i--){
					if(board[i][stoneW]==1)break;
					if(board[i][stoneW]==3){
						maxTime=time+1;
						break;
					}
				}
				if(i!=-1){
					temp=board[i][stoneW];
					board[i][stoneW]=0;
					move(time+1,i+1,stoneW,board);
					board[i][stoneW]=temp;
				}
			}
			//go down
			if(stoneH!=h-1 && board[stoneH+1][stoneW]!=1){
				for(i=stoneH+1;i<h;i++){
					if(board[i][stoneW]==1)break;
					if(board[i][stoneW]==3){
						maxTime=time+1;
						break;
					}
				}
				if(i!=h){
					temp=board[i][stoneW];
					board[i][stoneW]=0;
					move(time+1,i-1,stoneW,board);
					board[i][stoneW]=temp;
				}
			}
			//go left
			if(stoneW!=0 && board[stoneH][stoneW-1]!=1){
				for(i=stoneW-1;i>-1;i--){
					if(board[stoneH][i]==1)break;
					if(board[stoneH][i]==3){
						maxTime=time+1;
						break;
					}
				}
				if(i!=-1){
					temp=board[stoneH][i];
					board[stoneH][i]=0;
					move(time+1,stoneH,i+1,board);
					board[stoneH][i]=temp;
				}
			}
			//go right
			if(stoneW!=w-1 && board[stoneH][stoneW+1]!=1){
				for(i=stoneW+1;i<w;i++){
					if(board[stoneH][i]==1)break;
					if(board[stoneH][i]==3){
						maxTime=time+1;
						break;
					}
				}
				if(i!=w){
					temp=board[stoneH][i];
					board[stoneH][i]=0;
					move(time+1,stoneH,i-1,board);
					board[stoneH][i]=temp;
				}
			}
		}
	}
}