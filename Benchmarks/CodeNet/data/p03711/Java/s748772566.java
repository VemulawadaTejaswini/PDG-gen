import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else {
            boolean b1 = Arrays.asList(a).contains(x);
            boolean b2 = Arrays.asList(a).contains(y);
            if ((b1 && b2) || (!b1 && !b2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}