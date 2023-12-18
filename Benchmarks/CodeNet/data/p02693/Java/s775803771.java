import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String ans = (k-a%k <= b-a) ? "OK" : "NG";
    System.out.println(ans);
  }
}