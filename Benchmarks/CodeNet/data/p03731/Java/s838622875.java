
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
        int n = sc.nextInt();
        int t = sc.nextInt();
        int array[] = new int[n];
        long sum = t;
        forl(n, array, sc);
        for (int i = 1; i < n; i++) {
            if (array[i] < sum) {
                sum += t - (sum - array[i]);
            } else {
                sum += t;
            }
        }
        System.out.println(sum);
        bw.flush();
    }

    public static void forl(int n, int[] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }
}
