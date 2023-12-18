import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long x = scan.nextLong();
        long u = 0;
        while(x >= 500) {
            x -= 500;
            u += 1000;
        }
        while(x >= 5) {
            x -= 5;
            u += 5;
        }
        System.out.println(u);

        scan.close();
        return;
    }
}