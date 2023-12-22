import java.util.Scanner;

public class Main {

	/**標準偏差を求める
	 *
	 * @param args 0:入力するデータの数 1~k:データの要素
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		for(;scan.hasNext();){		//苦肉の策
			int num = scan.nextInt();
			if(num == 0){			//入力データ数が0で終了
				break;
			}
//			int num = Integer.parseInt(args[k]);

			int sum = 0;
			//データ要素を配列に格納
			int[] input_set = new int[num]; 
			for(int i = 0; i < num; i++){
				input_set[i] = scan.nextInt();
			}	

			//合計値の計算
			for(int i = 0; i < num; i++){
				sum = sum + input_set[i];
			}
			double ave = (double)sum /(double)num;
			
			//標準偏差の計算
			double pow = 0;
			for(int i = 0; i < num ; i++){
				pow = pow + Math.pow(input_set[i] - ave, 2) ;
			}
			double bunsan = pow / (double)num;
			double hensa = Math.sqrt(bunsan);



			System.out.println(hensa);

		}
	}
}

