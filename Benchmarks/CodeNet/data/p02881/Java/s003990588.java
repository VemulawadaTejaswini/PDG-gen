import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		// スペース区切りの整数の入力
		long b = (long)Math.pow(a, 0.5);
		// 文字列の入力
		for(long i = b; i > 0; i--){
			if(a % i == 0){
				System.out.println(i + a / i - 2);
              break;
			}
		} 
		
		
	}
}