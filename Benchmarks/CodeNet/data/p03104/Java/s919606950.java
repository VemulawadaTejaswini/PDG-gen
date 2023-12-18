import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long res = (b - a) / 2 % 2;
      if(a % 2 == 1) res = res ^ a;
      if(b % 2 == 0) res = res ^ b;
      System.out.println(res);
  }
}