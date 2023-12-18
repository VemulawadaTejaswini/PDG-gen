import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    System.out.println(S.equals("Sunny") ? "Cloudy" : S.equals("Cloudy") ? "Rainy" : "Sunny");
  }
}
