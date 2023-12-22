import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextLong();
    double y = (double) x;
    double z = 100;
    long sum = 0;
    while (z<y){
      long g = (long) z/100;
      z+=g;
      sum += 1;
    }
    System.out.println(sum);
  }
}
