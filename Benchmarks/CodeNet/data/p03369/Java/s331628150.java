import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    int price = 700;
    
    String first = s.substring(0, 1);
    String second = s.substring(1, 2);
    String third = s.substring(2, 3);
    
    if (first.equals("o")) {
      price += 100;
    }
    if (second.equals("o")) {
      price += 100;
    }
    if (third.equals("o")) {
      price += 100;
    }
    
    System.out.println(price);
  }
}