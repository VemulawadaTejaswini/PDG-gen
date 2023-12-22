import java.util.Scanner;

/**
 * 与えられた数(swap[])の各桁の和を計算するプログラムを作成する。
 * @author U633758
 *
 */
public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		for(;scan.hasNext();){
			int sum=0;
			char[] swap = scan.nextLine().toCharArray();	//char型の配列に格納する


			for(int i=0;i<swap.length;i++){
				sum = sum + Character.getNumericValue(swap[i]);
			}
			if(sum != 0){
				System.out.println(sum);
			}else{
				break;
			}
		}
	}
}
