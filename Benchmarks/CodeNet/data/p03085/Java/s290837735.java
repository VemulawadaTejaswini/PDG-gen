import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    if(x.equals("A")){
      System.out.print("T");
    }else if(x.equals("T")){
      System.out.print("A");
    }else if(x.equals("C")){
      System.out.print("G");
    }else if(x.equals("G")){
      System.out.print("C");
    }
  }
}