import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int LINES = 5;
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int H = sc.nextInt();
			
			if(H == 0){
				break;
			}
			
			int[][] map = new int[H][LINES];
			for(int i = H - 1; i >= 0; i--){
				for(int j = 0; j < LINES; j++){
					final int val = sc.nextInt();
					
					map[i][j] = val;
				}
			}
			
			int score = 0;
			while(true){
				boolean updated = false;
				/*
				System.out.println("----------------------------------------");
				for(int i = 0; i < H; i++){
					for(int j = 0; j < LINES; j++){
						System.out.print(map[i][j] + " ");
					}
					System.out.println();
				}
				*/
				for(int i = 0; i < H; i++){
					for(int j = 0; j < LINES; j++){
						if(map[i][j] == 0){
							continue;
						}
						
						int end = j + 1;
						while(end < LINES && map[i][end] == map[i][j]){
							end++;
						}
						
						final int size = end - j;
						//System.out.println(i + " " + j + " " + end + " " + size);
						if(size >= 3){
							for(int k = j; k < end; k++){
								score += map[i][k];
								map[i][k] = 0;
								updated = true;
							}
						}
					}
				}
				
				if(!updated){
					break;
				}
				
				for(int i = 0; i < H; i++){
					for(int j = 0; j < LINES; j++){
						if(map[i][j] == 0){
							
							boolean ok = false;
							for(int k = i + 1; k < H; k++){
								if(map[k][j] != 0){
									ok = true;
									break;
								}
							}
							
							if(!ok){
								break;
							}
							
							for(int k = i + 1; k < H; k++){
								map[k - 1][j] = map[k][j];
							}
							map[H - 1][j] = 0;
							j--;
						}
					}
				}
			}
			
			System.out.println(score);
		}
	}
	

}