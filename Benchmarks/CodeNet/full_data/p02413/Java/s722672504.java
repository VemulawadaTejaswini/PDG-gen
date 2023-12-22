import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();	//行数
		int c = scan.nextInt();	//列数
		int[][] array = new int[r + 1][c + 1];
		for(int i = 0; i < r; i++){
			for(int l = 0; l < c; l++){
					array[i][l] = scan.nextInt();
			}//for
			array[i][c] = sum(array[i]);
		}//for
		for(int i = 0; i < c + 1; i++){
			array[r][i] = sum(array, i);
		}
		for(int i = 0; i < r + 1; i++){
			for(int l = 0; l < c + 1; l++){
				if(l != 0) System.out.print(" ");
				System.out.print(array[i][l]);
			}//for
			System.out.println();
		}//for
	}
	public static int sum (int[] array){
		int n = 0;
		for(int i = 0; i < array.length - 1; i++){
			n += array[i];
		}
		return n;
	}
	public static int sum (int[][] array, int col){
		int n = 0;
		for(int i = 0; i < array.length - 1; i++){
			n += array[i][col];
		}
		return n;
	}
}