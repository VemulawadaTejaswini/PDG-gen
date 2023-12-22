import java.util.Scanner;
public class Main {
	
	public static void Bomb(int Array[][],int x,int y){
		Array[x][y]=0;
		if(x>0&&Array[x-1][y]==1){
			Bomb(Array,x-1,y);
		}
		if(x>1&&Array[x-2][y]==1){
			Bomb(Array,x-2,y);
		}
		if(x>2&&Array[x-3][y]==1){
			Bomb(Array,x-3,y);
		}
		if(y>0&&Array[x][y-1]==1){
			Bomb(Array,x,y-1);
		}
		if(y>1&&Array[x][y-2]==1){
			Bomb(Array,x,y-2);
		}
		if(y>2&&Array[x][y-3]==1){
			Bomb(Array,x,y-3);
		}
		if(x<7&&Array[x+1][y]==1){
			Bomb(Array,x+1,y);
		}
		if(x<6&&Array[x+2][y]==1){
			Bomb(Array,x+2,y);
		}
		if(x<5&&Array[x+3][y]==1){
			Bomb(Array,x+3,y);
		}
		if(y<7&&Array[x][y+1]==1){
			Bomb(Array,x,y+1);
		}
		if(y<6&&Array[x][y+2]==1){
			Bomb(Array,x,y+2);
		}
		if(y<5&&Array[x][y+3]==1){
			Bomb(Array,x,y+3);
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int dataset;
		dataset=sc.nextInt();
		for(int i=0;i<dataset;i++){
			int board[][]= new int[8][8];
			for(int j=0;j<8;j++){
				int tmp;
				tmp=sc.nextInt();
				for(int k=0;k<8;k++){
					board[j][k]=(int) (tmp/(Math.pow(10, 7-k)));
					if(board[j][k]==1){
						tmp-=(int)Math.pow(10, 7-k);
					}
				}
			}
			int x,y;
			x=sc.nextInt();
			y=sc.nextInt();
			Bomb(board,y-1,x-1);
			System.out.println("Data "+(i+1)+":");
			for(int j=0;j<8;j++){
				for(int k=0;k<8;k++){
					System.out.print(board[j][k]);
					if(k==7){
						System.out.print("\n");
					}
				}
			}
		}
		
			
		
		
		
	}
}