import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main m = new Main();
        m.resolve(scan);
        scan.close();
    }

    final private void resolve(Scanner scan) {
        int k = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt();
        int tmp = k;
        while (tmp < a) {
            tmp += k;
        }
        if (tmp > b) {
            System.out.println("NG");
        } else {
            System.out.println("OK");
        }
    }
}