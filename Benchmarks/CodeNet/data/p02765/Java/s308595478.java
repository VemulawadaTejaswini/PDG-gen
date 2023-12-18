import java.util.*;
public class Main {
  public static void main(String[] args){
    
    int num = 2;
    int hrate = 2919;

    if (num >= 10){
      System.out.println("内部レートは" + hrate);
    } else {
      System.out.println(hrate + 100 * (10 - num));
    }
  }
}