import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
//		入力ｎを読み取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		ｎを３で割る		
//		それを初期値aにする
		int a = n/3;
//		aを出力
		//System.out.println(a);
		
//	n回繰り返す
		int b = 0;
		for(int i=0;b<n;i++){

			b = b + 3; //3ずつ増やす
//			bとして出力
			System.out.print(" "+b);
		}

	}

}

