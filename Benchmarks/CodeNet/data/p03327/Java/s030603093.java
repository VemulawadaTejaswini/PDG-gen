import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    //整数の入力
      int A = sc.nextInt();
      int B = sc.nextInt();
      if(A <= 999){
        System.out.println("ABC");
      } else {
        System.out.println("ABD");
      }
  }
} 