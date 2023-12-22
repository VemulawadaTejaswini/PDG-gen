//package hoge; のようなパッケージ宣言は提出前に除く
//インポート文など
import java.util.Scanner;
import java.math.BigDecimal;
public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      	String a = in.next();
        String b = in.next();
      	BigDecimal c = new BigDecimal(a);
        BigDecimal d = new BigDecimal(b);
        BigDecimal e = c.multiply(d);
        BigDecimal f = e.setScale(0, BigDecimal.ROUND_DOWN);
        System.out.println(f);      	
    }
}