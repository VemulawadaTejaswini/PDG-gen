import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final String in = sc.next();
			
			if("#".equals(in)){
				break;
			}
			
			int[][] next = new int[][]{
					{ 1,  2},
					{-1,  3},
					{ 1, -1},
					{ 4,  5},
					{ 5,  2},
					{ 2,  1}
			};
					
			int cur = 0;
			char[] path = in.toCharArray();
			
			boolean miss = false;
			
			for(int i = 0; i < path.length; i++){
				int p = path[i] == '1' ? 1: 0;
				
				if(next[cur][p] == -1){
					miss = true;
					break;
				}
				
				cur = next[cur][p];
				//System.out.println(cur);
			}
			
			if(miss || cur != 5){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}
	}

}