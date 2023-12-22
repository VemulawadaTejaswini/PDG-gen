import java.util.Scanner;
public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int intNum = scan.nextInt();

		//配列の宣言、要素数は入力された数値
		int[] array = new int[intNum];

		//配列に要素を格納
		for(int i = 0 ;i < array.length;i++){
			array[i] = scan.nextInt();
		}

		//要素数/2 回交換を行う
		for(int i = 0 ;i < array.length / 2;i++){
				//配列の最後尾
				int intBack = array.length - i - 1;

				int intCh = array[i];
				array[i] = array[intBack];
				array[intBack] = intCh;
		}
		for(int i = 0 ;i < array.length - 1;i++ ){
		System.out.print(array[i] + " ");
		}
		System.out.println(array[array.length - 1]);
		scan.close();
	}
}

