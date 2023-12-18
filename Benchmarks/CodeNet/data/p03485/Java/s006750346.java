import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      //変数の初期化
      int A = 1;
	  int B = 100;
      //整数の入力
          A = sc.nextInt();

          B = sc.nextInt();

      //少数切り上げで表示

      System.out.print(Math.round((A + B) / 2));
    }
}