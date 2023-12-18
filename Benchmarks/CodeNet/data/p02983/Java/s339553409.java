import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int l = sc.nextInt();
		// スペース区切りの整数の入力
		int r = sc.nextInt();
		// 文字列の入力
		int result = 0;
		result = (l * (l + 1)) % 2019; 
		// 出力
		System.out.println(result);
	}
}