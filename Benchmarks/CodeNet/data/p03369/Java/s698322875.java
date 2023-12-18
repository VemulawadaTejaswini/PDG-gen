import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] ramen = s.toCharArray();
    int cost = 700;

    if (ramen[0]=='o'){
      cost += 100;
    }
    if (ramen[1]=='o'){
      cost += 100;
    }
    if (ramen[2]=='o'){
      cost += 100;
    }
    System.out.println(cost);
  }
}
