import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      
      //文字列Sの取得
      String S = sc.nextLine();
      //文字列Tの取得
      String T = sc.nextLine();
 
      //置き換え回数
      int count = 0;
      
      for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            char t = T.charAt(i);
            
            if (!(s == t)) {
               count++;
            }
      }
 
		System.out.println(count);
    }
}