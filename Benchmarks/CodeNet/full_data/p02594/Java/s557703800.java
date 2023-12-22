import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int x = sc.nextInt();

		if(x >= 30){
			// 出力
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}