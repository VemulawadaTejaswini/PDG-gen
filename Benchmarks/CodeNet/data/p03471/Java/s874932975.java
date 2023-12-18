import java.util.*;

public class Main {
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int Y = sc.nextInt();
    for(int x = n; x >= 0; x--) {
        if((10000 * x) != 0 && (Y / (10000 * x) == 1 && Y % (10000 * x) == 0))  {
          System.out.println(x + " " + 0 + " " + 0);
          return;
        }
      
        for (int y = n - x; y >= 0; y--) {
            int z = n - x - y;
            if(Y / (10000 * x + 5000 * y + 1000 * z) == 1 && Y % (10000 * x + 5000 * y + 1000 * z) == 0) {
              System.out.println(x + " " + y + " " + z);
              return;
            }
        }
    }
    System.out.println("-1 -1 -1");
 }
}