import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値を取得
		int a = sc.nextInt();
		int b = sc.nextInt();
		String aStr = String.valueOf(a);
		String bStr = String.valueOf(b);
		String abStr = aStr + bStr;
		int ab = Integer.parseInt(abStr);
		boolean squareFlag = false;
		// 約数を求める
		ArrayList <Integer> divList = new ArrayList<Integer>();
		for(int i = 1; i <= ab ; i++){
			if(ab%i == 0 && ab/i == i){
				squareFlag = true;
			}
		}
		if(squareFlag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}