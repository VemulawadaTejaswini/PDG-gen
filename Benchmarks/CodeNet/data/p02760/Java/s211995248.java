import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			remove(arr, b[i]);
		}
		if(diagonal(arr) || horizontal(arr) || vertical(arr)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	public static int diagonal(int[][] arr){
		if(arr[0][0] == 0 && arr[1][1] == 0 && arr[2][2] == 0){
			return 1;
		}
		return 0;
	}
	
	public static int horizontal(int[][] arr){
		if((arr[0][0] == 0 && arr[0][1] == 0 && arr[0][2] == 0) || (arr[1][0] == 0 && arr[1][1] == 0 && arr[1][2] == 0) || (arr[2][0] == 0 && arr[2][1] == 0 && arr[2][2] == 0)){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static int vertical(int[][] arr){
		if((arr[0][0] == 0 && arr[1][0] == 0 && arr[2][0] == 0) || (arr[0][1] == 0 && arr[1][1] == 0 && arr[2][1] == 0) || (arr[0][2] == 0 && arr[1][2] == 0 && arr[2][2] == 0)){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static void(int[][] arr, int a){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(arr[i][j] == a){
					arr[i][j] = 0;
				}
			}
		}
	}
	
	}