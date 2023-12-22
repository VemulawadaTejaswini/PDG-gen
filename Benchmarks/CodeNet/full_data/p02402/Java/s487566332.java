import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long s = 0;

        for (int i = 0; i < n; i++) {
            s += a[i];
        }

        System.out.println(a[0] + " " + a[n - 1] + " " + s);
    }
}

    

