import static java.lang.Integer.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            char[] n = sc.next().toCharArray();
            if (n[0] == '0') {
                break;
            }
            System.out.println( "black blue lime aqua red fuchsia yellow white".split(" ") [parseInt("" + n[1] + n[2], 16) / 128 * 4 + parseInt("" + n[3] + n[4], 16) / 128 * 2 + parseInt("" + n[5] + n[6], 16) / 128]);
        }
    }
}
