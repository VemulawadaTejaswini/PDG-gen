import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long k = sc.nextLong();
    long ans = 0;

    if(k < a){
      ans = k;
    } else if(k <= a + b){
      ans = a;
    } else {
      ans = 2 * a + b - k;
    }

    System.out.println(ans);
  }
}
