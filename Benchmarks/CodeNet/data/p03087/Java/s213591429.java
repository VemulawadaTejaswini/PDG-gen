import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    for(int i = 0; i < q; i++){
      int l = sc.nextInt();
      int r = sc.nextInt();
      String tmp = s.substring(l - 1, r);
      int sum = tmp.length();
      int remove = tmp.replace("AC", "").length();
      System.out.println((sum - remove) / 2);
    }
  }
}