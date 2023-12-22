
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.next());
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        scan.close();

        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");
    }
}