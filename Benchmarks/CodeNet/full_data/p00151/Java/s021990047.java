import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			boolean[][] map = new boolean[n][n];
			
			for(int i = 0; i < n; i++){
				char[] ch = sc.next().toCharArray();
				
				for(int j = 0; j < n; j++){
					map[i][j] = ch[j] == '1';
				}
			}
			
			int max = 0;
			for(int i = 0; i < n; i++){
				int count = 0;
				
				for(int j = 0; j < n; j++){
					if(map[i][j] == true){
						count++;
					}
				}
				
				max = Math.max(max, count);
			}
			
			for(int i = 0; i < n; i++){
				int count = 0;
				
				for(int j = 0; j < n; j++){
					if(map[j][i] == true){
						count++;
					}
				}
				
				max = Math.max(max, count);
			}
			
			for(int i = 0; i < n; i++){
				int count = 0;
				
				for(int j = 0; j <= i; j++){
					//System.out.print("( " + (i - j) +" " + j + ") ");
					if(map[i - j][j] == true){
						count++;
					}
				}
				//System.out.println();
				max = Math.max(max, count);
			}
			
			for(int i = 0; i < n; i++){
				int count = 0;
				
				for(int j = n - 1; j >= i; j--){
					//System.out.print("( " + j +" " + (j - i) + ") ");
					if(map[j][j-i] == true){
						count++;
					}
				}
				//System.out.println();
				max = Math.max(max, count);
			}
			
			for(int i = 0; i < n; i++){
				int count = 0;
				
				for(int j = 0; j < (n - i) ; j++){
					//System.out.print("( " + (j) +" " + (i+j) + ") ");
					if(map[j][i+j] == true){
						count++;
					}
				}
				//System.out.println();
				max = Math.max(max, count);
			}
			
			for(int i = 0; i < n; i++){
				int count = 0;
				
				for(int j = 0; j < (n - i); j++){
					//System.out.print("( " + (i + j) +" " + (i) + ") ");
					if(map[i+j][i] == true){
						count++;
					}
				}
				//System.out.println();
				max = Math.max(max, count);
			}
			
			System.out.println(max);
		}

	}

}