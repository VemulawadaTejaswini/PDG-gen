import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long s =sc.nextLong();
    long a = 1;
    for(int i=1; i<=s; i++){
      a = a * i % 1000000007;
    }
    System.out.println(a);
  }
}