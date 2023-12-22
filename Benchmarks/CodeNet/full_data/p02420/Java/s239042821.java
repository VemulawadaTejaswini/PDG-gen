import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String m = scan.next();
            if (m.equals("-")) break;
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int h = scan.nextInt();
                m = m.substring(h) + m.substring(0, h);
            }
            System.out.println(m);
        }
    }
}