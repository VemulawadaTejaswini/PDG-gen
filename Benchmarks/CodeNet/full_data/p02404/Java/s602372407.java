import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0) break;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(i == 0 || j == 0 || i == H-1 || j == W-1) System.out.print("#");
					else System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
