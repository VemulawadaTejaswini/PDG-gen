import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[][] lens = new int[n+1][];
			boolean[][] wipes = new boolean[n+1][];
			
			for(int i = 0; i <= n; i++){
				final int m = sc.nextInt();
				lens[i] = new int[m-1];
				wipes[i] = new boolean[m-2];
				
				int prev_x = Integer.MIN_VALUE;
				int prev_y = Integer.MIN_VALUE;
				int prev_dx = Integer.MIN_VALUE;
				int prev_dy = Integer.MIN_VALUE;
				for(int j = 0; j < m; j++){
					if(j == 0){
						prev_x = sc.nextInt();
						prev_y = sc.nextInt();
					}else{
						final int x = sc.nextInt();
						final int y = sc.nextInt();
						
						final int dx = x - prev_x;
						final int dy = y - prev_y;
						
						lens[i][j-1] = dx * dx + dy * dy;
						if(j != 1){
							int dot = prev_dx * dy - prev_dy * dx;
							
							if(dot < 0){
								wipes[i][j - 2] = true;
							}else{
								wipes[i][j - 2] = false;
							}
						}
						
						prev_x = x;
						prev_y = y;
						prev_dx = dx;
						prev_dy = dy;
					}
				}
			}
			
			for(int i = 1; i <= n; i++){
				if(lens[0].length != lens[i].length){
					continue;
				}
				
				//System.out.println(i);
				//System.out.println(Arrays.toString(lens[i]));
				//System.out.println(Arrays.toString(wipes[i]));
				
				
				boolean flag = true;
				for(int j = 0; j < lens[0].length; j++){
					if(lens[0][j] != lens[i][j]){
						flag = false;
						break;
					}else if(j > 0 && wipes[0][j-1] != wipes[i][j-1]){
						flag = false;
						break;
					}
				}
				
				if(flag){
					System.out.println(i);
					continue;
				}
				
				flag = true;
				for(int j = lens[0].length - 1;  j >= 0; j--){
					//System.out.println((j - 1) + " " + (lens[0].length - j - 1));
					if(lens[0][lens[0].length - 1 - j] != lens[i][j]){
						flag = false;
						break;
					}else if(j > 0 && wipes[0][lens[0].length - j - 1] == wipes[i][j-1]){
						flag = false;
						break;
					}
				}
				
				if(flag){
					System.out.println(i);
					continue;
				}
			}
			
			System.out.println("+++++");
		}
		
		
	}

}