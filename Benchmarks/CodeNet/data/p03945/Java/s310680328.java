import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    //整数の入力
    String str = sc.next();


    //前方から順番に文字が切り替わる回数をカウントする
    int len = str.length();
    int cnt = 0;

    for(int i=0; i<len-1; i++){
      char before = str.charAt(i);
      char after = str.charAt(i+1);

      if(before != after)cnt++;
    }

    System.out.println(cnt);


  }
}
