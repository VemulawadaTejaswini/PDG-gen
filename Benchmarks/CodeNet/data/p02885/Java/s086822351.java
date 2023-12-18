import java.util.*;

public class Main{
  public static void main(String[] args){
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a - b * 2;
    if(c >= 0){
      System.out.println(c);
    }else{
      System.out.println("0");
    }
  }
}