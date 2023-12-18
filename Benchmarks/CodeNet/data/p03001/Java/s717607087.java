import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int flag = 0;

    BigDecimal wBig = new BigDecimal(W);
    BigDecimal hBig = new BigDecimal(H);
    BigDecimal xBig = new BigDecimal(x);
    BigDecimal yBig = new BigDecimal(y);
    BigDecimal two = new BigDecimal(2);

    BigDecimal half = wBig.multiply(hBig).divide(two, 9, RoundingMode.DOWN);

    if(xBig.equals(wBig.divide(two)) && yBig.equals(hBig.divide(two))) {
    	flag = 1;
    }

    System.out.println(half + " " + flag);
  }
}