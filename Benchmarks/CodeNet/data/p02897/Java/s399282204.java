import java.util.*;
 
public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x > y & x > z){
              System.out.println(y + z);
            } else if(y > x & y > z){
              System.out.println(x + z);
            } else {
              System.out.println(x + y);
            }
      }
}