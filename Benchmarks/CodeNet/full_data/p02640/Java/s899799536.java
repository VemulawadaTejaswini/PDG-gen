import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = 0; i <= x; i++) {
            if (i * 2 + (x - i) * 4 == y) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
