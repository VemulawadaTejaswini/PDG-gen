
package javaapplication127;
import java.util.*;

public class Main {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = (n*800) - ((n/15) *200);
        System.out.println(y);
    }
    
}
