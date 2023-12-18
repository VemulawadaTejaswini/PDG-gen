import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        String S = sc.next();
      int a = 1;//初期値には必ず1匹は存在しているため0ではない
      for(int i =1; i<N; i++){
      if(S.charAt(i)!=S.charAt(i-1)){//後半のchar()-1は公式である,ここでi=0にしてしまうとマイナスの数値が出てきてしまう
        a = a+1;                     //1番目と0番目の文字が違っている場合文字のカウントを行う
      }
      }
      System.out.println(a);//異なった文字ではない場合,カウントしない
    }
}