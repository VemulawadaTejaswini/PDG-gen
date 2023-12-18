import java.util.*;
import java.math.BigDecimal;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 各座標
    BigDecimal w = new BigDecimal(sc.nextInt());
    BigDecimal h = new BigDecimal(sc.nextInt());
    BigDecimal x = new BigDecimal(sc.nextInt());
    BigDecimal y = new BigDecimal(sc.nextInt());
    
    // 分割方法が複数あるか
    int isSeparateMulti = 0;
    // 対角線上に x,y があれば複数ある (m * y == h * x)
    if(w.multiply(y).compareTo(h.multiply(x)) == 0){
      isSeparateMulti = 1;
    }
    
    // まず W,Hの長方形の面積
    BigDecimal sqWH = w.multiply(h);
    BigDecimal sqInner = new BigDecimal(0);
    
    System.out.println(sqWH.divide(new BigDecimal(2)));
    System.out.println(isSeparateMulti);   
  }
}
