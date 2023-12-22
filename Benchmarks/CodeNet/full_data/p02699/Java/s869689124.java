import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int seep = sc.nextInt();
		int wolf = sc.nextInt();
		// 出力
		System.out.println(wolf >= seep ? "unsafe" : "safe ");
	}
}