import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a == 2 || b == 2){
      System.out.println(0);
    }else if(a == 1 && b == 1){
      System.out.println(1);
    }else if(a == 1 || b == 1){
      System.out.println(a * b - 2);
    }else{
      System.out.println((a-2) * (b-2));
    }
  }
}