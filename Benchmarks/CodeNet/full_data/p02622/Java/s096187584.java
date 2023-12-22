import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力(S)
      	String S = sc.next();
        //入力(T)
      	String T = sc.next();
        //カウント
        int count=0;

      	for(int i=0;i<S.length();i++){
          if(S.charAt(i) != (T.charAt(i))){
          	count ++;
          }
        }

		// 出力
		System.out.println(count);
	}
}