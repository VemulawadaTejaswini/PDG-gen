import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 半径rの入力
		int r = Integer.parseInt(sc.nextLine());
		// 半径1の円の面積の何倍になるか出力する
		System.out.println(r*r);
	}
}
