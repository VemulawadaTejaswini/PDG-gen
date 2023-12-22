import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;

        for (int i = n; i > 0; i--) {
            a++;
            if (a % 3 == 0 || a % 10 == 3) {
                System.out.print(" " + a);
            }
        }
    }
}