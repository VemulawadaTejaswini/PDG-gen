
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = Integer.parseInt(scan.next());
        int w = Integer.parseInt(scan.next());
        scan.close();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

    }
}