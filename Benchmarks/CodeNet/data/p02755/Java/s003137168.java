import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    double min_a = Math.ceil(a / 0.08);
    double max_a = Math.floor((a + 1) / 0.08);
    double min_b = Math.ceil(b / 0.1);
    double max_b = Math.floor((b + 1) / 0.1);

    if(min_a < max_b && min_b <= max_a){
      System.out.println((int)min_b);
    } else if(min_b < max_a && min_a <= max_b){
      System.out.println((int)min_a);
    } else {
      System.out.println("-1");
    }
  }
}
