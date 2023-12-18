import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = x / 100;
        int e = x % 100;
        if (x > 2100 || (d > 0 && e <= d * 5)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
