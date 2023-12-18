import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
      //入力
      double N = sc.nextDouble();//木の本数
      double D = sc.nextDouble();
      
      //1人の監視員が監視できる範囲
      double one = (D*2.0)+1.0;
      
      //監視員が最低何人必要か求める
      double min = N/one;
      
      
       //BigDecimalクラスを利用して小数点以下すべて切り上げ
          //BigDecimal min1 = new BigDecimal(String.valueOf(min));
          //double ans = min.setScale(0, RoundingMode.UP);
       BigDecimal min1 = new BigDecimal(min);  	
       BigDecimal ans = min1.setScale(0, BigDecimal.ROUND_UP);
       System.out.println(ans);
    }
}