
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        //forl(n, array, sc);
        int h = sc.nextInt();
        int w = sc.nextInt();
        for (int i = 0; i < h + 2; i++) {
            if (i == 0 || i == h + 1) {
                for (int j = 0; j < w + 2; j++) {
                    System.out.print("#");
                }
            } else {
                System.out.print("#" + sc.next() + "#");
            }
            System.out.println();
        }
        bw.flush();
    }

    public static void forl(int n, int[] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }
}
