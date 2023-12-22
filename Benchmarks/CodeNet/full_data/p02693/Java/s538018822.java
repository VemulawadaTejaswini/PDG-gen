
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.next());
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        scan.close();

        int c = a / k;
        int d = b / k;

        if (c != d || c % k == 0) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

    }
}