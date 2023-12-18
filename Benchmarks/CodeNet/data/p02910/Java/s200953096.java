import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
        String out = "";
        // sの文字列分の要素を持つ配列"strArray"作成
        String[] strArray = new String[s.length()];

		// 変数strの長さ分回す
        for (int i = 0; i < s.length(); i++) {
    	// 配列に順番に格納する
    		strArray[i] = String.valueOf(s.charAt(i));
		}
 
      
		System.out.println(check(strArray));
	}
  
  public static String check(String[] str){
	String out = "Yes";
    //判定関数
    for(int i=0;i<str.length;i++){
     if(i%2==0){
       //奇数(要素番号は偶数)
       if(str[i].equals("L"))
        out = "No";
     }
      else if(i%2==1){
       if(str[i].equals("R"))
         out = "No";
      }
    }
    
    return out;
  }
}