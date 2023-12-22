import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    a = sc.nextInt();
    b = sc.nextInt();
    while(a != 0 || b != 0){
      System.out.println(a > b ? b + " " + a : a + " " + b );
      a = sc.nextInt();
      b = sc.nextInt();
    }
  }
}