import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a == 100){
      System.out.println(b * (int)Math.pow(100, a+1));
    }else{
      System.out.println(b * (int)Math.pow(100, a));
    }
  }
}