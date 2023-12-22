
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    static void run() {
        int k = in.nextInt();
        String s = in.next();
        int i = 0;
        for (;i<k && i<s.length();i++) {
            System.out.print(s.charAt(i));
        }
        if (i < s.length()) System.out.print("...");
        System.out.println();
    }

    public static void main(String[] args) {
        run();
    }
}
