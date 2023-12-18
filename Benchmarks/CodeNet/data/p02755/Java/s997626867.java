import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    double min_a = a / 0.08;
    double max_a = (a + 1) / 0.08;
    double min_b = b / 0.1;
    double max_b = (b + 1) / 0.1;

    if(min_a <= max_b && min_b <= max_a){
      System.out.println((int)Math.ceil(min_b));
    } else if(min_b <= max_a && min_a <= max_b){
      System.out.println((int)Math.ceil(min_a));
    } else {
      System.out.println("-1");
    }
  }
}
