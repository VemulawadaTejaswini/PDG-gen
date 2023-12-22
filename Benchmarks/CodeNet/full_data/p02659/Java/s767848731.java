import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigDecimal a = new BigDecimal(sc.next());
    BigDecimal b = new BigDecimal(sc.next());
    System.out.println(a.multiply(b).toBigInteger());
  }
}
