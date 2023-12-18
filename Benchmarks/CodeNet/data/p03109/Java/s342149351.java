import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = Integer.parseInt(s.substring(0,4));
    int b = Integer.parseInt(s.substring(5,7));
    int c = Integer.parseInt(s.substring(8,10));
    if(a < 2019){
      System.out.println("Heisei");
    }else if(a > 2019){
      System.out.println("TBD");
    }else{
      if(b < 4){
        System.out.println("Heisei");
      }else if(b > 4){
        System.out.println("TBD");
      }else{
        if(c <= 30){
          System.out.println("Heisei");
        }else{
          System.out.println("TBD");
        }
      }
    }
  }
}
