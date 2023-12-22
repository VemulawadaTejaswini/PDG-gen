import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    if(b>n){
      System.out.println(Math.floor((a*n)/b)-a*Math.floor(n/b));
    }
    else{
      int x = b-1;
      System.out.println(Math.floor((a*x)/b)-a*Math.floor(x/b));
    }
  }
}