import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a = ni();
        int b = ni();
        int c = ni();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            so.println(0);
            return;
        }
        
        int max = Math.max(a, Math.max(b, c));
        so.println(a*b*c / max);
    } 

    static int ni() {
        return sc.nextInt();
    }
    
    static long nl() {
        return sc.nextLong();
    }

    static char[] nsToChars() {
        return sc.next().toCharArray();
    }
}
