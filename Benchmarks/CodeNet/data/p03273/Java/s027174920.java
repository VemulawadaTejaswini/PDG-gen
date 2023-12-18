import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] board = new char[H][W];
		boolean[] Hb = new boolean[H];
		boolean[] Wb = new boolean[W];
		
		for(int i = 0; i < H; i++){
			String line = sc.next();
			for(int j = 0; j < W; j++){
				board[i][j] = line.charAt(j);
			}
		}
		
		for(int i = 0; i < H; i++){
			int count = W;
			for(int j = 0; j < W; j++){
				if(board[i][j] == '.') count--;
			}
			if(count == 0){
				Hb[i] = true;
			}
		}
		
		for(int j = 0; j < W; j++){
			int count = H;
			for(int i = 0; i < H; i++){
				if(board[i][j] == '.') count--;
			}
			if(count == 0){
				Wb[j] = true;
			}
		}
		
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(Hb[i] || Wb[j]) ;
				else System.out.print(board[i][j]);
			}
			if(!Hb[i]) System.out.println();
		}
	}
}