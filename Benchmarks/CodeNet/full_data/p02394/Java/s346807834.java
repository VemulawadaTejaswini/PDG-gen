import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();

        if(r <= x && x <= w-r) {
            if(r <= y && y <= h-r) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
