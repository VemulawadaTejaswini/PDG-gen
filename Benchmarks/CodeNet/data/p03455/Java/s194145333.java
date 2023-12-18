import java.util.*;
public class Main{
  private static void main(String[] args) {
    int a = new Scanner(System.in).nextInt();
    int b = new Scanner(System.in).nextInt();
    if (a*b%2 == 0){
      System.out.println("偶数");
    }else{
      System.out.println("奇数");
    }
  }
}
