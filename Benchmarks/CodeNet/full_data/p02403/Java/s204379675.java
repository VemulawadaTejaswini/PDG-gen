import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scan_ = new Scanner(System.in);
   int h_ = 0;
   int w_ = 0;
   while(scan_.hasNext()) {
      h_ = scan_.nextInt();
      w_ = scan_.nextInt();
      if(h_ != 0 | w_!=0) {
       for( int i = 0; i < h_ ; i++) {
         for(int n = 0; n < w_ ; n++) {
           System.out.print("#");
         }
         System.out.println();
       }
       
       System.out.println();
    }
    
  }
}
}
