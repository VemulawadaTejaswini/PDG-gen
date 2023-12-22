import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	static final int UP = 1;
	static final int RIGHT = 2;
	static final int DOWN = 4;
	static final int LEFT = 8;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numInput = Integer.parseInt(br.readLine());
		int width = 0;
		for(int i = 0; i < numInput; i++){
			width = Integer.parseInt(br.readLine());
			printSpiral(width);
			if(i == numInput - 1)System.out.println();
		}
	}
	
	public static void printSpiral(int n){
		if(n == 1){
			System.out.println("#");
			return;
		}
		boolean[][] spiral = createSpiral(n);
		for(boolean[] line : spiral){
			for(boolean row : line){
				if(row == true)		System.out.print("#");
				else				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	private static boolean[][] createSpiral(int n){
		boolean[][] spiral = new boolean[n][n];
		//一番左
		for(int i = 0; i < n; i++){
			spiral[i][0] = true;
		}
		//それ以降
		int[] length = new int[2];
		length[0] = n - 1;
		length[1] = n - 1;
		int direction = RIGHT;
		int c = 0;
		int x = 0, y = 0;
		while(true){
			for(int i = 0; i < length[c % 2]; i++){
				switch(direction){
				case UP:	y--;	break;
				case RIGHT:	x++;	break;
				case DOWN:	y++;	break;
				case LEFT:	x--;	break;
				}
				spiral[y][x] = true;
			}
			length[c++ % 2] -= 2;
			if(length[0] + length[1] < 2)	break;
			direction = direction * 2 % 15;
		}
		return spiral;
	}
}