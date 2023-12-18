import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        int count = 1;
        while (n / count > 2) {
            long v = n - count;
            long mod = v % count;
            long sho = v / count;
            if (mod == 0 && (n / sho) == (n % sho)) {
                ans += sho;
            } else if (count > sho) {
                break;
            }
            count++;
        }
        System.out.println(ans);
    }
}