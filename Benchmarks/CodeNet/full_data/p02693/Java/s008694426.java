import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String ans = (a/k * k + k <= b || a%k == 0) ? "OK" : "NG";
    System.out.println(ans);
  }
}