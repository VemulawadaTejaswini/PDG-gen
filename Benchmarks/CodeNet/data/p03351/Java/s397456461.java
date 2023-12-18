import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.next();
            int b = sc.next();
            int c = sc.next();
            int d = sc.next();
            if(b - a <= d && c - b <= d){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
          }
}