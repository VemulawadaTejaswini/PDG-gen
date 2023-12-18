import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		b = b / 2;
		
		System.out.println(a + b);
	}	
}
