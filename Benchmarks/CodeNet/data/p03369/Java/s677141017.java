import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a =700;
    
    if(s.equals("ooo")){
      a = 1000;
    }else if(s.equals("oxo")||s.equals("oox")||s.equals("xoo")) {
      a = 900;
    } else if(s.equals("oxx")||s.equals("xxo")||s.equals("xox"))oxx{
      a = 800;
    }
    System.out.println(a);
  }
}