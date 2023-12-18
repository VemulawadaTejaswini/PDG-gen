import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字数の入力
		int N = sc.nextInt();
		// 文字列の入力
		String S = sc.next();
        int count = 0; 
        
		
		// replaceでABCを抜く
		S = S.replace("ABC","");
        count = ( N - S.length )/3; 
        System.out.println(count);
	}
}