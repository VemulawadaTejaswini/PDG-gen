import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        
        if(n % (2 * d + 1) == 0) {
            System.out.println((int)(n / (2 * d + 1)));
        }else {
            System.out.println((int)(n / (2 * d + 1)) + 1);
        }
        
        
    }
}