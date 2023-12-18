import java.util.Scanner;

public class Main {
	static void best(int num,int[][] arr){
		
		System.out.println(arr[num][1]);
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int w = s.nextInt();
		
		int[][] arr= new int[10][10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) 
				arr[i][j]=s.nextInt();
		}
		
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][k] + arr[k][j] < arr[i][j])
                        arr[i][j] = arr[i][k] + arr[k][j];
				}
			}
		}
		int sum=0;
		int [][] wall = new int[h][w];
		for (int i = 0; i < wall.length; i++) {
			for (int j = 0; j < wall[0].length; j++) {
				wall[i][j] = s.nextInt();
				if(wall[i][j]!=-1){
					sum+= arr[wall[i][j]][1];
				}
			}
		}
		System.out.println(sum);	
	}
}
