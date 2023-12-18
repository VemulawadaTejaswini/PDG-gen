import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      //整数の入力
      int A = sc.nextInt();
      
      int B = sc.nextInt();
      
      //平均を表示
      int x = (Math.round((A + B) / 2));
      
      System.out.print(x);
    }
}