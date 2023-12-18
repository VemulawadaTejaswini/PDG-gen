import java.util.*;

public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum = 0;
      
      if (a + b < c * 2) {
        sum = a * x + b * y;
      } else { 
        int set = 0;
        int xzan = 0;
        int yzan = 0;
        
        if(x > y) {
           if(c * 2 < a) {
            set = x;
           }
           else {
            set = y;
            xzan = x - y;   
           } 
        } else {
            if(c * 2 < b) {
                set = y;
            } else {
                set = x;
                yzan = y - x;   
            }
        }
        sum = (set * c * 2) + (xzan * a) + (yzan * b);
      }
      
      System.out.println(sum);
      
  }
}