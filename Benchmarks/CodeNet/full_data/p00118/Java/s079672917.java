import java.util.Scanner;

public class Main {
	
	public static void search(final int x, final int y, final int W, final int H,boolean[][] reached, char[][] input){
		reached[y][x] = true;
		
		if(x != 0 && input[y][x] == input[y][x-1] && reached[y][x-1] == false){
			search(x-1,y,W,H,reached,input);
		}
		
		if(y != 0 && input[y][x] == input[y-1][x] && reached[y-1][x] == false){
			search(x,y-1,W,H,reached,input);
		}
		
		if(x != W-1 && input[y][x] == input[y][x+1] && reached[y][x+1] == false){
			search(x+1,y,W,H,reached,input);
		}
		
		if(y != H-1 && input[y][x] == input[y+1][x] && reached[y+1][x] == false){
			search(x,y+1,W,H,reached,input);
		}
		
		return;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			if(H == 0 && W == 0){
				break;
			}
			
			char[][] input = new char[H][W];
			for(int i = 0; i < H; i++){
				char[] tmp = sc.next().toCharArray();
				for(int j = 0; j < W; j++){
					input[i][j] = tmp[j];
				}
			}
			
			boolean[][] reached = new boolean[H][W];
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					reached[i][j] = false;
				}
			}
			
			int count = 0;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(reached[i][j] == false){
						count++;
						search(j,i,W,H,reached,input);
					}
				}
			}
			
			System.out.println(count);
		}
		
		return;
	}
	
}