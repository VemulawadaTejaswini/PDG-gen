import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		String ink;
		String[] code;
		int[][] map = new int[10][10];
		int[] x = new int[3];
		int count = 0,max = 0;
		
		while((ink = sc.next()) != null){
			code = ink.split(",",0);
			
			for(int i = 0; i < code.length; i++)
				x[i] = Integer.parseInt(code[i]);
			
			if(x[2] >= 1){
				map[x[0]][x[1]]++;
				map[x[0]][x[1]-1]++;
				map[x[0]][x[1]+1]++;
				map[x[0]-1][x[1]]++;
				map[x[0]+1][x[1]]++;
				}
			if(x[2] >= 2){
				map[x[0]-1][x[1]-1]++;
				map[x[0]+1][x[1]-1]++;
				map[x[0]-1][x[1]+1]++;
				map[x[0]+1][x[1]+1]++;
			}
			if(x[2] == 3){
				map[x[0]][x[1]-2]++;
				map[x[0]][x[1]+2]++;
				map[x[0]+2][x[1]]++;
				map[x[0]-2][x[1]]++;
			}
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(map[i][j] == 0)count++;
				if(max < map[i][j])max = map[i][j];
			}
		}
		System.out.println(count + "\n" + max);
	}
}