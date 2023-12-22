import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextLong();
    double y = (double) x;
    double z = 100;
    long sum = 0;
    while (z<y){
      z = z*101;
      int t = (int) z%100;
      z -= t;
      z = z/100;
      sum += 1;
    }
    System.out.println(sum);
  }
}
