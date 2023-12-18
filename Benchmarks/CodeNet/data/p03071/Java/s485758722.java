import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a > b) {
      System.out.println(a + a-1);
    }

    if (b > a) {
      System.out.println(b + b-1);
    }

    if (a == b) {
      System.out.println(a + b);
    }



  }
}
