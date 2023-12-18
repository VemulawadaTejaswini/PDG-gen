import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String order = s.nextLine();
    int cost = 700;
    for(int i = 0; i < 3 ; i++)
      if(order.charAt(i) == 'o')cost += 100;
    System.out.printf("%d",cost);
  }
}