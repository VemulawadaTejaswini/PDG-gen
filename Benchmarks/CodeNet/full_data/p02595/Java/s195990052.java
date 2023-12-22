import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); int d = in.nextInt();
      int count = 0;
      while(n > 0){
          n--;
          int x = in.nextInt();
          int y = in.nextInt();
          if(x*x + y*y <= d*d) count++;
      }
      System.out.println(count);
    }
}