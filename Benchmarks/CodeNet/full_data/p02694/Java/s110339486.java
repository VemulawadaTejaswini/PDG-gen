import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    double y = (double) x;
    double z = 100;
    int sum = 0;
    while (z<y){
      z = z*1.01;
      int g = (int) z;
      z = (double) g;
      sum += 1;
    }
    System.out.println(sum);
  }
}
