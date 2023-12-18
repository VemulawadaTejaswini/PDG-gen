import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = ni();
        a[1] = ni();
        a[2] = ni();
        if (a[0] % 2 == 0 && a[1] % 2 == 0 && a[2] % 2 == 0) {
            so.println(0);
            return;
        }
        
        Arrays.sort(a);
        so.println((long)a[0] * a[1]);
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
