import java.util.*;
import java.lang.Integer;
 
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int W = sc.nextInt();
      int H = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      double area = 0.0;
      
      if (x+x==W && y+y==H){
        area = (double)W*(double)H/2.0;
        System.out.println(area);
        System.out.println(1);
      }
      else{
        area = (double)W*(double)H/2.0;
        System.out.println(area);
        System.out.println(0);
      }
    }  
}