import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s =0;
      if(c-a+b > 0){
        s=c-a-b;
        }
        
		// 出力
		System.out.println(s);
	}
}