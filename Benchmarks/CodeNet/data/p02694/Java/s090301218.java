import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long x = sc.nextLong();
    long tmp = 100;
    long ans = 0;

    while(tmp < x){
      tmp *= 1.01;
      ans += 1;
    }

    System.out.println(ans);
  }
}
