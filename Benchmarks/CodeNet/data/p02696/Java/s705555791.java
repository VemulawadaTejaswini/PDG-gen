import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    if(b>n){
      System.out.println(n);
    }
    else{
      System.out.println(b-1);
    }
  }
}