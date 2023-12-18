import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        long max = Math.max(a, b);
        List<Long> list = new ArrayList<>();
        for (long i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                list.add(i);
            }
        }

        long ans = a * b;
        for (long i : list) {
            ans /= i;
        }
        System.out.println(ans);

        sc.close();
    }

}
