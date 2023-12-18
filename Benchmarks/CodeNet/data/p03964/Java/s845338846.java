import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long t = 1;
    long a = 1;
    for(int i = 0; i < n; i++){
      int tt = sc.nextInt();
      int at = sc.nextInt();
      long max = Math.max(ceil(t / (double)tt), ceil(a / (double)at));
      t = max * tt;
      a = max * at;
    }
    System.out.println(a + t);
  }
  
  public static long ceil(double a){
    long aa = (long)a;
    if(a - aa != 0){
      aa++;
    }
    return aa;
  }
}