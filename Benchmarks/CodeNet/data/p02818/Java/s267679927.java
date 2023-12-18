import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        for (int i = 0; i < c; i++) {
            if (a > 0) {
                a--;
            }
            else if (b > 0) {
                b--;
            }
        }
        System.out.println(a + " " + b);
    }
}
