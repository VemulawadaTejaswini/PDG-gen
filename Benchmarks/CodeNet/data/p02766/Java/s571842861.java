
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int k = sc.nextInt();
		
		// 出力
		System.out.println((int)(Math.log(n)/Math.log(k))+1);
	}
}