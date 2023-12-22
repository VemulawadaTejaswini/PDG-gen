
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.next());
        String s = scan.next();
        scan.close();

        String[] ss = s.split("");

        if (ss.length <= k) {
            System.out.println(s);
        } else {
            for (int i = 0; i < k; i++) {
                System.out.print(ss[i]);
            }
            System.out.println("...");
        }

    }

}
