import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int a, b, c;

      a = Integer.parseInt(scan.next());
      b = Integer.parseInt(scan.next());
      c = Integer.parseInt(scan.next());

      if(a + b*2 >=c){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }

      
    }
    catch (Exception e) {
      
    }
  }
}