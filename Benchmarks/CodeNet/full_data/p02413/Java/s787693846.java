import java.util.Scanner;
public class Main {
	/**
	 * 表計算プログラム
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();	//行数
		int c = scan.nextInt();	//列数
		int[][] array = new int[r + 1][c + 1];
		//入力された数字を格納する
		for(int i = 0; i < r; i++){
			for(int l = 0; l < c; l++){
					array[i][l] = scan.nextInt();
			}//for
			//1行を格納した後、行の合計を計算をする
			array[i][c] = sum(array[i]);
		}//for
		for(int i = 0; i < c + 1; i++){
			//全ての数字を格納し終わってから列の合計を計算する
			array[r][i] = sum(array, i);
		}//for
		//出力
		for(int i = 0; i < r + 1; i++){
			for(int l = 0; l < c + 1; l++){
				if(l != 0) System.out.print(" ");
				System.out.print(array[i][l]);
			}//for
			System.out.println();
		}//for
	}//main
	/**
	 * 行の合計
	 * @param array
	 * @return n
	 */
	public static int sum (int[] array){
		int n = 0;
		for(int i = 0; i < array.length - 1; i++){
			n += array[i];
		}//for
		return n;
	}//sum
	/**
	 * 列の合計
	 * @param array
	 * @param col
	 * @return 
	 */
	public static int sum (int[][] array, int col){
		int n = 0;
		for(int i = 0; i < array.length - 1; i++){
			n += array[i][col];
		}//for
		return n;
	}//sum
}