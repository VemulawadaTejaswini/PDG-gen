import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {

        Scanner sc =  new Scanner(new File("input.txt"));
        System.setOut(new PrintStream("output.txt"));

        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] res = new int[n];
        for (int i =0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            res[i] = a[i + 1] - a[i];
        }
        res[0] = (n - a[n - 1]) + a[0];

        int in = 0;
        for (int i = 1; i < n; i++) {
            if (Math.min(res[in], res[i]) == res[i]) {
                in = i;
            }
        }
        System.out.println(k - res[in]);
    }
}