import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int s = sc.nextInt();
		int w = sc.nextInt();
		w = w * 2;
		
		if (s <= w) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
	}
}