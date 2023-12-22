import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      	//カウント用変数の宣言
        int count = 0;
		//文字列の入力
		String s = sc.next();
		String t = sc.next();
		
      	//SとTが一致しないとき、文字を変換して一致させる処理を行う
		if(!s.equals(t)){
    		//文字列の文字数と等しい配列を宣言
    		String[] sList = new String[s.length()];
    		String[] tList = new String[t.length()];
    		//配列に一文字ずつ格納
    		for(int i = 0; i < s.length(); ++i){
                sList[i] = String.valueOf(s.charAt(i)); 
    		}
    		for(int i = 0; i < t.length(); ++i){
    		    tList[i] = String.valueOf(t.charAt(i));
    		}
    		
        	//SをTと比較し、Sの一致していない部分をTと同じものに変換する
        	int i = 0;
        	while(!s.equals(t)){
        	   sList[i] = tList[i];
        	}
        	count = i;
        }
    	//出力
		System.out.println(count);
    }
}
