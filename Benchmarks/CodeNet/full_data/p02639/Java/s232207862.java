import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int x = in.nextInt();
            if (x == 0) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
