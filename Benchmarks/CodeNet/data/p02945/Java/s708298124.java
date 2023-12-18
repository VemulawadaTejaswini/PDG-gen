import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int A;
        int B;
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
        int kakeru = A*B;
        int plus = A+B;
        int minus = A-B;
        int a1=Math.max(kakeru,plus);
        int max = Math.max(minus,a1);
		System.out.println(max);
	}
}