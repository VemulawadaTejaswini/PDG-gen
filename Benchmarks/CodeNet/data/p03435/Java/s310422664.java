import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a1 = Integer.parseInt(sc.next());
    int a2 = Integer.parseInt(sc.next());
    int a3 = Integer.parseInt(sc.next());
    int b1 = Integer.parseInt(sc.next());
    int b2 = Integer.parseInt(sc.next());
    int b3 = Integer.parseInt(sc.next());
    int c1 = Integer.parseInt(sc.next());
    int c2 = Integer.parseInt(sc.next());
    int c3 = Integer.parseInt(sc.next());
    
    boolean flg = true;
    if(
        a1-a2 != b1-b2 || a1-a3 != b1-b3 ||
        a1-a2 != c1-c2 || a1-a3 != c1-c3 || 

        a1-b1 != a2-b2 || a1-b1 != a3-b3 || 
        a1-c1 != a2-c2 || a1-c1 != a3-c3
    ){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }
  }
}
