import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String order = sc.next();
    order = order.replace("x","");
    int total = 700 + 100 * order.length();
    System.out.println(total);
  }
}
