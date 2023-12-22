import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
          int number = Integer.parseInt(s.next());
        int min = Integer.parseInt(s.next());
        int max = Integer.parseInt(s.next());
          
          if (flag(max, min, number)) System.out.println("OK");
          else System.out.println("NG");
      	
    }

    public static boolean flag (int max, int min, int number) {
        if ((max - min) > number) return true;
        else {
            for (int i = min; i <= max; i++) {
                if (i%number == 0) {
                    return true;
                }
            }
            return false;
          }
    }
}