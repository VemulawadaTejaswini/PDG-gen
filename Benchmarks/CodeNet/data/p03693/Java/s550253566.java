import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int sum = 100 * a + 10 * b + c;
        
		// 出力
		System.out.println(sum % 4 == 0 ? "YES" : "NO");
	}
}
