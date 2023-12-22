import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int OP = 149;
	static int[][][] field;
	static int[][] right_ref;
	
	static int Setting(){
		for(int i=0;;i++){
			if(field[i][OP][OP]==0){
				return i;
			}
		}
	}
	
	// 修正
	static int Setting2(int x, int y){
		for(int i=0;;i++){
			if(field[i][x][y]==0){
				return i;
			}
		}
	}

	static void Taosu(int floor, int top, int front, int right){
		int x=OP, y=OP;
		while(true){
//			System.out.println(floor+" "+top+" "+front+" "+right);
			int un_floor = floor-1;
			int flag = 0;
			int max = 0;
			if(un_floor==-1){
//				System.out.println("tuchi");
				return;
			}
			if(field[un_floor][x-1][y]==0&&front>=4){
				flag = 1;
				max=front;
			}
			if(field[un_floor][x+1][y]==0&&front<=3){
				if(max<7-front){
					flag = 2;
					max=7-front;
				}
			}
			if(field[un_floor][x][y-1]==0&&right<=3){
				if(max<7-right){
					flag = 3;
					max = 7-right;
				}
			}
			if(field[un_floor][x][y+1]==0&&right>=4){
				if(max<right){
					flag = 4;
				}
			}
			if(flag==0){
//				System.out.println("No");
				return;
			}
			else{
				int put = 0;
				if(flag==1){
//					System.out.println("front");
					put = Setting2(x-1,y);      // 修正
					field[put][x-1][y] = 7-front;  // 修正
					field[floor][x][y] = 0;
					int tmp = front;
					front = top;
					top = 7-tmp;
					x--;
				}
				else if(flag==2){
//					System.out.println("behind");
					put = Setting2(x+1,y);  // 修正
					field[put][x+1][y] = front;  // 修正
					field[floor][x][y] = 0;
					int tmp = front;
					front = 7-top;
					top = tmp;
					x++;
				}
				else if(flag==3){
//					System.out.println("left");
					put = Setting2(x,y-1);  // 修正
					field[put][x][y-1] = right;  // 修正
					field[floor][x][y] = 0;
					int tmp = top;
					top = right;
					right = 7-tmp;
					y--;
				}
				else if(flag==4){
//					System.out.println("right");
					put = Setting2(x,y+1); // 修正
					field[put][x][y+1] = 7-right;
					field[floor][x][y] = 0;
					int tmp = top;
					top = 7-right;
					right = tmp;
					y++;
				}
				floor = put;		// 修正
			}
		}	
	}
		public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
//		System.setOut(new PrintStream(new File("result.txt")));
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] fall_top = new int[n];
			int[] fall_front = new int[n];
			field = new int[110][300][300];
			for(int i=0;i<n;i++){
				fall_top[i] = stdIn.nextInt();
				fall_front[i] = stdIn.nextInt();
			}
			
			for(int i=0;i<n;i++){
				// put
				int tmp = Setting();
				field[tmp][OP][OP] = fall_top[i];
				
				// Taosu
				int right;
				right_ref = new int[7][7];
				right_ref[1][2]=3;
				right_ref[1][3]=5;
				right_ref[1][4]=2;
				right_ref[1][5]=4;
				right_ref[2][1]=4;
				right_ref[2][3]=1;
				right_ref[2][4]=6;
				right_ref[2][6]=3;
				right_ref[3][1]=2;
				right_ref[3][2]=6;
				right_ref[3][5]=1;
				right_ref[3][6]=5;
				right_ref[4][1]=5;
				right_ref[4][2]=1;
				right_ref[4][5]=6;
				right_ref[4][6]=2;
				right_ref[5][1]=3;
				right_ref[5][3]=6;
				right_ref[5][4]=1;
				right_ref[5][6]=4;
				right_ref[6][2]=4;
				right_ref[6][3]=2;
				right_ref[6][4]=5;
				right_ref[6][5]=3;
				right = right_ref[fall_top[i]][fall_front[i]];
				Taosu(tmp,fall_top[i],fall_front[i],right);
				
			}
			
			// TOP_MAX
			int[] output = new int[7];
			Arrays.fill(output, 0);
			for(int i=0;i<109;i++){
				for(int j=0;j<300;j++){
					for(int k=0;k<300;k++){
						if(field[i+1][j][k]==0&&field[i][j][k]!=0){
//							System.out.println("log "+i+" "+j+" "+k+" "+field[i][j][k]);
							output[field[i][j][k]]++;
						}
					}
				}
			}
			for(int i=1;i<6;i++){
				System.out.print(output[i]+" ");
			}
			System.out.println(output[6]);
		}
	}
}