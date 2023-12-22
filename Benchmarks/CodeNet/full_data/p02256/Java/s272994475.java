import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getGCD(sc.nextInt(), sc.nextInt()));
    }
    
    static int getGCD(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return getGCD(y, x % y);
        }
    }
}
