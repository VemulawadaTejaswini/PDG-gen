
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if (n == 1) {
            System.out.println(k);
            return;
        }

        System.out.println((k - 1) * n);

    }


}
