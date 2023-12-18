import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long t = sc.nextInt();
    long a = sc.nextInt();
    for(int i = 0; i < n-1; i++){
      int tt = sc.nextInt();
      int at = sc.nextInt();
      long max = Math.max((int)Math.ceil(t / (double)tt), (int)Math.ceil(a / (double)at));
      t = max * tt;
      a = max * at;
    }
    System.out.println(a + t);
  }
}