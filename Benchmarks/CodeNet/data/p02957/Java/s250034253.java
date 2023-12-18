import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = (a+b)/2;
    if(a+b == x*2){
      System.out.println(x);
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }
}
