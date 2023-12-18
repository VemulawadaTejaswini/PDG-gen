import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double m = Math.floor(n/1.08);
    double l = Math.floor(m * 1.08);

    if (l == n) {
      System.out.println(m);
    } else {
      System.out.println(":(");
    }
  }
}
