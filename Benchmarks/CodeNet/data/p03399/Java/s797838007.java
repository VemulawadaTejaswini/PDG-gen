import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
      
        int train = (a > b ? a : b);
        int bus = (c > d ? c : d);
		// 出力
		System.out.println(train + bus);
	}
}