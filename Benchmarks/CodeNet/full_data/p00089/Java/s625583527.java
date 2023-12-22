import java.util.Scanner;
import static java.lang.Math.*;
class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int map[][] = new int [105][105];
		int x = 0,
			last = 0;
		String temp [];
		while(true){
			
			temp  = sc.next().split(",");
			for(int i = 0; i < temp.length; i++){
				map[x][i] = Integer.parseInt(temp[i]);
			}
			x++;
			if(!sc.hasNext())break;
		}
	
		int Memo[][] = new int [105][105];
		Memo[0][0] = map [0][0];
		for(int i = 0; i < 100; i++){
			if(x/2 > i){
				Memo[i + 1][0] =  max(Memo[i][0], Memo[i][0]) + map[i + 1][0];
				for(int j = 1; j < 100; j++){  
					Memo[i + 1][j] = max(Memo[i][j], Memo[i][j - 1]) + map[i + 1][j];
				}
			}else {
				for(int j = 0; j  < 100; j++){
					Memo[i + 1][j] = max(Memo[i][j],Memo[i][j + 1]) + map[i + 1][j];
				} 
				
			} 
			  
		}
		/******************************************
		for(int i = 0; i < 100; i ++){
			for(int j = 0; j < 100; j++){
				System.out.print(Memo[i][j] + "|"); 
			}
			System.out.println();
		}	/************************
		for(int i = 0; i < 100; i ++){
			for(int j = 0; j < 100; j++){
				System.err.print(map[i][j] + "|");
			}
			System.out.println();
		}
		**********************************************/
		System.out.println(Memo[100][0] + last);
	}
} 