import java.util.*;
public class Fav{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int cost = s.nextInt();
    int total = s.nextInt();
    int max = s.nextInt();
 
    if (cost == 0) {
	  System.out.println(0);
    } else {
      System.out.println(Math.min(max, total / cost));
    }
  }
}
