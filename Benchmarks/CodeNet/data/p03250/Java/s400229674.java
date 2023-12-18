import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.next();
            int b = sc.next();
            int c = sc.next();
            if(a * 10 + b + c > a + 10 * b + c){
            System.out.println(a * 10 + b + c);
          } else {
            System.out.println(a + 10 * b + c);
        }
          }
}