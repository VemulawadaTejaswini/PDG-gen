import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      //aの入力を受け取る
      int a = sc.nextInt();
      
      //bの入力を受け取る
      int b = sc.nextInt();
      
      //aとbの平均を変数に入れる
      int c = ((a + b) / 2);
      
      //小数点を切り上げて表示する
      System.out.print(Math.round(c));
    }
}