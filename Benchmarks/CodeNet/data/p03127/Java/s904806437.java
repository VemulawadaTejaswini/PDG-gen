import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] list = new long[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list);

        long min = list[0];

        for (int i = 1; i < n; i++) {
            long value = gcd(list[0], list[i]);
            if(value < min) {
                min = value;
            }
            if (min == 1) {
                break;
            }
        }

        System.out.println(min);
    }

    private static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}