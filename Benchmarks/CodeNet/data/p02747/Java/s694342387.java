import java.util.*;

public class hitachi{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int j = 0;
    int x = 0;
    String str = scan.next();
    String[] atr = str.split("");
    for(String s:atr){
      if(i == 2 && s.equals("i")){
        i = 0;
        x = 1;
      }
      if(s.equals("h")){
        if(i == 2){
        }else{
          i = 1;
        }
      }
      if(i == 1 && s.equals("i")){
        j = 1;
        i = 2;
      }
    }
    if(i == 2||(x == 1 && j == 1)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
