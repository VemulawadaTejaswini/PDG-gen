import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            } else {
                int x = i;
                while (x != 0) {
                    if (x % 10 == 3) {
                        System.out.print(" " + i);
                        break;
                    }
                    x /= 10;
                }
            }
        }
        System.out.println();
    }
}