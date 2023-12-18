import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int p = sc.nextInt();
        int sum = a * 3 + p;
    
		// 出力
		System.out.println((sum - (sum % 2)) / 2);
	}
}