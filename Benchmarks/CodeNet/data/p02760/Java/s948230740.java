import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[][] bingoCard = new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				bingoCard[i][j] = scan.nextInt();
			}
		}
		boolean[][] bingoCheck = {{false,false,false},{false,false,false},{false,false,false}};
		
		int n = scan.nextInt();
		for(int a = 0; a < n; a++){
			int b = scan.nextInt();
			
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(b == bingoCard[i][j]){
						bingoCheck[i][j] = true;
					}
				}
			}
		}
		
		int bingoNum = 0;
		
		for(int i = 0; i < 3; i++){
			int lineFlag = 0;
			for(int j = 0; j < 3; j++){
				if(bingoCheck[i][j]){
					lineFlag++;
				}
			}
			if(lineFlag == 3){
				bingoNum++;
			}
		}
		
		for(int i = 0; i < 3; i++){
			int lineFlag = 0;
			for(int j = 0; j < 3; j++){
				if(bingoCheck[j][i]){
					lineFlag++;
				}
			}
			if(lineFlag == 3){
				bingoNum++;
			}
		}
		
		int lineFlag = 0;
		for(int i = 0; i < 3; i++){
			if(bingoCheck[i][i]){
				lineFlag++;
			}
		}
		if(lineFlag == 3){
			bingoNum++;
		}
		lineFlag = 0;
		for(int i = 2; i >= 0; i--){
			if(bingoCheck[i][i]){
				lineFlag++;
			}
		} 
		if(lineFlag == 3){
			bingoNum++;
		}
		
		String res;
		if(bingoNum > 0){
			res = "Yes";
		}else{
			res = "No";
		}
		System.out.println(res);
	}
}