import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(scn.hasNextInt()) {
            int a = scn.nextInt(), b = scn.nextInt();
            int c = euclid(a > b ? a : b, a < b ? a : b);
            System.out.println(c + " " + (long)a * b / c);
        }
    }
    
    private static int euclid(int x, int y) {
        if(y > 0) {
            return euclid(y, x % y);
        } else {
            return x;
        }
    }
}