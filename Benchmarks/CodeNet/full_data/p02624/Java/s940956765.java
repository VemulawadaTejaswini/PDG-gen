import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SOD(n);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += sod_arr[i] * i;
        }
        System.out.println(sum);
    }
    static long[] sod_arr;

    public static void SOD(long n) {
        sod_arr = new long[10000000 + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                // System.out.println("j "+sod_arr[j]);
                sod_arr[j]++;
            }
        }
    }

}
