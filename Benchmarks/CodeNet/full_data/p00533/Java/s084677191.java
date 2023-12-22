import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int H = sc.nextInt();
		int W = sc.nextInt();
		int i , j , k;
		
		String[] weather = new String[H];
		for(i = 0 ; i < H ; i++){
			weather[i] = sc.next();
		}
		
		char[][] weatherArray = new char[H][W];
		for(i = 0 ; i < H ; i++){
			for(j = 0 ; j < weather[i].length() ; j++){
				weatherArray[i][j] = weather[i].charAt(j);
			}
		}
		
		int[][] count = new int[H][W];
		
		for(i = 0 ; i < H ; i++){
			if(weatherArray[i][0] == 'c'){
				count[i][0] = 0;
			}else if(weatherArray[i][0] == '.'){
				count[i][0] = -1;
			}
		}
		
		for(i = 0 ; i < H ; i++){
			for(j = W - 1 ; j > 0 ; j--){
out:			if(weatherArray[i][j] == 'c'){
					count[i][j] = 0;
				}else if(weatherArray[i][j] == '.'){
					for(k = 1 ; k < j + 1 ; k++){
						count[i][j]++;
						if(weatherArray[i][j - k] == 'c'){
							break out;
						}
						if(count[i][j] == j){
							count[i][j] = -1;
							break out;
						}
					}
				}
			}
		}		
		for(i = 0 ; i < H ; i++){
			for(j = 0 ; j < W ; j++){
				System.out.print(count[i][j]);
				if(j + 1 != W){
					System.out.print("");
				}
			}
			System.out.println("");
		}
	}
}