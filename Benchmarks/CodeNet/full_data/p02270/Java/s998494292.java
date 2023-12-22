import java.util.*;
import java.io.*;

public class Main {

    static int[] a;
    static int n;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solv());
    }

    static int solv() {
        int left = 0;
        int right = 1000000000;
        while (right - left > 1) {
            int cent = (left + right) / 2;
            if (check(cent)) {
                right = cent;
            } else {
                left = cent;
            }
        }
        return right;
    }

    static boolean check(int p) {
        int index = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            while (sum+a[index] <= p) {
                sum += a[index];
                index++;
                if (index == n) { return true; }
            }
        }
        return false;
    }
}