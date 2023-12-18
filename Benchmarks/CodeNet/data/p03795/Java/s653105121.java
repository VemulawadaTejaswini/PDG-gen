import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int x = n * 800;
        int y = (n - n % 15) / 15 * 200;
    
		// 出力
		System.out.println(x - y);
	}
}