import java.util.Scanner;


/**
 * Small, Large, or Equalのエントリポイントを持つメインクラスです。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            System.out.println((a == b) ? "a == b" : (a > b) ? "a > b" : "a < b");
        } finally {
            stdIn.close();
        }
    }
}