import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力(スペース改行関係なし)
		String s = sc.next() + ".";
      	String t = sc.next();

		if(t.matches(s)){
			// 出力
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}