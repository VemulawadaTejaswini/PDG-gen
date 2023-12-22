import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y % 2 != 0) {
            System.out.println("No");
            return;
        }

        if (x * 4 < y) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
