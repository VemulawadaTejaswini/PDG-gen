import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int cakes = 4;
        int donuts = 7;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                int total = (i * cakes) + (j * donuts);
                if (total == a) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
