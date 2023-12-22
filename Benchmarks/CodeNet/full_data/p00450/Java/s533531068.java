import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] board = new int[n];
			int white_count = 0;
			for(int i = 0; i < n; i++){
				boolean is_white = sc.nextInt() == 0;
				
				if((i + 1) % 2 == 0){
					int push_color = is_white ? 1 : -1;
					
					int count = 0;
					for(int j = i - 1; j >= 0; j--){
						if(push_color == board[j]){
							break;
						}
						count++;
					}
					
					for(int j = 0; j <= count; j++){
						board[i - j] = push_color;
					}
					
					if(is_white){
						white_count += count + 1;
					}else{
						white_count -= count;
					}
				}else{
					board[i] = is_white ? 1 : -1;
					if(is_white){
						white_count++;
					}
				}
			}
			//System.out.println(Arrays.toString(board));
			
			System.out.println(white_count);
			
		}
	}

}