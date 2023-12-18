import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String B = sc.next();
     if(B.equals("A")){
       System.out.println("T");
    }else if(B.equals("T")){
    System.out.println("A");
     }else if(B.equals("C")){
    System.out.println("G");
  }else if(B.equals("G")){
    System.out.println("C");
  }
  }
}