import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    long n = sc.nextLong();
    long k = sc.nextLong();
    System.out.println(Math.min(n % k, Math.abs(k - n % k)));
  }
}