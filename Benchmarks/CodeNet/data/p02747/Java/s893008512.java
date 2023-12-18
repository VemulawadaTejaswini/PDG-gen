import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int x = 0;
    String str = scan.next();
    String[] atr = str.split("");
    for(String s:atr){
      if(i == 2 && s.equals("i")){
        i = 0;
      }
      if(s.equals("h")){
        i = 1;
      }
      if(i == 1 && s.equals("i")){
        i = 2;
        x++;
      }
    }
    if(i == 2 || x > 1 && i != 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
