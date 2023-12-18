import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();

        long[] list = {a, b, c, d, e};
        Arrays.sort(list);

        long count = n / list[0] + 5;

        System.out.println(count);
    }
}