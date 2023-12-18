
package javaapplication127;
import java.util.*;

public class Main {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cost = n*800;
        int ref = (n/15)*200;
        int y = cost-ref;
        System.out.println(y);
    }
    
}
