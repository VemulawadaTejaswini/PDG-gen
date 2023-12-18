import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long K = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    if(B - A <= 2){
      System.out.println(K + 1);
    }else{
      K -= A - 1;
      long ans = K / 2 * (B - A) + (K % 2) + A;
      System.out.println(ans);
    }
  }
}