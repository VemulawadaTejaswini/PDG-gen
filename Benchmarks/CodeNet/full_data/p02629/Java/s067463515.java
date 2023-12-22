import java.util.*;

public class Main{
  public static void main(String[] srgs){
    String alp = "abcdefghijklmnopqrstuvwxyz";
    String[] str = alp.split("");
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    String ans = "";
    while (n > 0){
      int i = n / 26;
      n = n % 26;
      ans += str[i];
    }
    System.out.println(ans);
  }
}
