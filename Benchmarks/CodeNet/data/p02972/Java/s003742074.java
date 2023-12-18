import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a = true;
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            if (in.nextInt() == 0) {
                System.out.println(0);
                a = false;
                break;
            }
        }
        if (a) {
            System.out.println(1);
            System.out.println(num);
        }
    }
}
