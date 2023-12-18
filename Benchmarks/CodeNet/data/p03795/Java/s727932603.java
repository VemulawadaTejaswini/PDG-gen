import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int refill = sc.nextInt();
        int x = 800 * refill;
        int y = 200 * (refill / 15);
        
        System.out.println(x - y);
    }
}