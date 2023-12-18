import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        for (int i = 0; i < w + 2; i++) {
            System.out.print("#");
        }
        System.out.println();

        for (int i = 0; i < h; i++) {
            System.out.print("#");
            System.out.print(sc.next());
            System.out.println("#");
        }

        for (int i = 0; i < w + 2; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}