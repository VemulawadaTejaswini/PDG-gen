import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int animal = scan.nextInt();
        int leg = scan.nextInt();

        int sum = 0;

        for (int i = 0; i <= animal; i++) {
            if ((i * 2 + (animal - i) * 4) == leg) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}
