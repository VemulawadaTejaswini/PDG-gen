import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		int A = sc.nextInt();
      
		int B = sc.nextInt();
		// 文字列の入力
		// 出力
      if(N*A<B){
		System.out.println(N*A);
    }else if(N*A>B){
        System.out.println(B);
      }
}
}