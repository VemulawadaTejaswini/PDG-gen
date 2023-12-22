import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        int result = 0;

        if(x < y) {
            int t = x;
            x = y;
            y = t;
        }

        while(true) {
            int z = x % y;
            x = y;
            y = z;
            if(y == 0) {
                System.out.println(x);
                break;
            }
        }
        
    }
}
