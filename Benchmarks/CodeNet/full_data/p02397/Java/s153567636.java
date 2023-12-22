import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		int big = 0;
		int small = 0;

		//テキスト入力
		Scanner sc = new Scanner(System.in);
		//入力文字を取得
		int first = sc.nextInt();
		int second = sc.nextInt();

		//小さい順に並べる
		if(first >= second){
			//
			big = first;
			small = second;
		}else{
			big = second;
			small = first;
		}

		//出力
		System.out.println(small+" "+big);
	}
}