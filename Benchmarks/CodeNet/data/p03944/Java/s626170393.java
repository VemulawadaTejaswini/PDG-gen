import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 

		int W = keyboard.nextInt();
		int H = keyboard.nextInt();
		int N = keyboard.nextInt();
		
		int[] menseki = new int[W*H];
		
		for(int i = N; i > 0; i--) {
			int X = keyboard.nextInt();
			int Y = keyboard.nextInt();
			int a = keyboard.nextInt();
			
			if(a == 1) {
				for(int a1 = 0; a1 < W*H; a1++) {
					if(a1 % W < X) {
						menseki[a1] = 1;	
					}
				}
			}else if(a == 2) {
				for(int a2 = 0; a2 < W*H; a2++) {
					if(a2 % W >= X) {
						menseki[a2] = 1;	
					}
				}
			}else if(a == 3) {
				for(int a3 = 0; a3 < W*H; a3++) {
					if(a3 < (Y*W)) {
						menseki[a3] = 1;	
					}
				}
			}else {
				for(int a4 = 0; a4 < W*H; a4++) {
					if(a4 >= (Y*W)) {
						menseki[a4] = 1;	
					}
				}
			}
		}
		
		int count = 0;
		for(int j = 0; j < W*H; j++){
			if(menseki[j] == 0) {
			count++;
			}
		}

		System.out.print(count);
		keyboard.close();	
	}
}
