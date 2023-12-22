import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      int A = Integer.parseInt(sc.next());

      int oturi = A%1000 == 0 ? A/1000 : A/1000 + 1;

      System.out.println(oturi);
    }  
}
