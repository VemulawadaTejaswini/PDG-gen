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
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt() + 2;
		int W = in.nextInt() + 2;
		for(int i = 0; i < H; i++){
			String line = "";
			if(i != 0 && i != H - 1) line = "#" + in.next() + "#";
			for(int j = 0; j < W; j++){
				if(i == 0 || i == H -1) System.out.print("#");
				else System.out.print(line.charAt(j));
			}
			System.out.println();
		}
	}
}
