import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      	if(a * b % 2 == 0){
			// 偶数
			System.out.println("Even");
        } else {
        	// 奇数
			System.out.println("Odd");
        }
	}
}