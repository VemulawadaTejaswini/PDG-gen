import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		
		// 整数の入力
		String a = sc.next();
		int b = a.length();
		int c =  a.length();
		int d = 753;
		String e;
		int f;
		int g;
		b = b - 2;
		
		for (int i = 0; i < b; i++) {
			e = a.substring(i, i + 3);
			f =  Integer.parseInt(e);
			g = d - f;
			myList.add(g);
			
		}
		System.out.println(Collections.min(myList));
	}
}
