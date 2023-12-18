import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scn = new Scanner(System.in);
      int a, b;

      a = Integer.parseInt(scn.next());
      b = Integer.parseInt(scn.next());

      if(a*b%2 == 1){
       System.out.println("Odd");
      }else if(a*b%2 == 0){
       System.out.println("Even");
      }

    }
    catch (Exception e) {

    }
  }
}
