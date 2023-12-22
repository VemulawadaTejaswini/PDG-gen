import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = (long)(sc.nextDouble() * 100);
      long res = a * b;
      System.out.println((a * b / 100));
  }
}