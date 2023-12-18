import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int a = sc.nextInt();

		int n = (int)Math.ceil((double)h/(double)a);

		// 出力
		System.out.println(n);
	}
}