
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
        long k = sc.nextLong();
        //forl(n, array, sc);
        long a1, b1;
        long ans = 0;
        long sum = 0;
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a1 = sc.nextLong();
            b1 = sc.nextLong();
            if (map.get(a1) == null) {
                map.put(a1, b1);
            } else {
                map.put(a1, map.get(a1) + b1);
            }
        }
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            sum += entry.getValue();
            if (sum >= k) {
                System.out.println(entry.getKey());
                break;
            }
        }
        bw.flush();
    }

    public static void forl(int n, int[] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }
}
