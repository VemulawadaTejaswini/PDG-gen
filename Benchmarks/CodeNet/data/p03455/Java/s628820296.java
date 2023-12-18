import java.util.*;
public class Main {
	public static void main(String[] args){
		
		// 入力受取
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 積を求める
		int by = a * b;
		
		// 偶奇判定
		if(by % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
	}
}