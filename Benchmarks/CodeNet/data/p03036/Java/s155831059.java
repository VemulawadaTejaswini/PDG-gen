import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int D = sc.nextInt();
            int x = sc.nextInt();
            int z = r * x - D;
        	System.out.println(z);
            for(int i = 1; i < 10; i++){
              int sab = r * z - D;
              z = sab;
              System.out.println(sab);
            }
          }
}